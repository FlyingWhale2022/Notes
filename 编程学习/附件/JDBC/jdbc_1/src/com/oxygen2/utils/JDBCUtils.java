package com.oxygen2.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Enthusiasm
 * @creat 2022/5/16-20:11
 */
public class JDBCUtils {
    /*
     * 创建连接方式1：自己创建连接，用完即销毁，效率低，占用资源。
     */
    public static Connection getConnection() throws Exception {
        Properties pos = new Properties();
        InputStream ips = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        pos.load(ips);

        String driverClass = pos.getProperty("driverClass");
        String user = pos.getProperty("user");
        String password = pos.getProperty("password");
        String url = pos.getProperty("url");

        Class.forName(driverClass);

        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    /*
     * 创建连接方式2：利用C3P0数据连接池建立连接
     */
    //连接池只造一个，因此需要在方法外将连接池造好，并且声明为静态的。
    private static ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");//这里要和xml文件里的名字对上

    public static Connection getConnectionBasedC3P0() throws SQLException {
        Connection conn = cpds.getConnection();
        return conn;
    }

    /*
    * 创建连接方式3：利用DBCP数据连接池建立连接
    */
    //连接池只造一个，因此需要在方法外将连接池造好，并且声明为静态的。
    static  DataSource source;
    static {
        try {
            Properties pros = new Properties();
            FileInputStream fis = new FileInputStream("src/dbcp.properties");
            pros.load(fis);

            source= BasicDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnectionBasedDBCP() throws SQLException {

        Connection conn = source.getConnection();
        return conn;
    }

    /*
     * 创建连接方式4：利用Druid数据连接池建立连接
     */
    //连接池只造一个，因此需要在方法外将连接池造好，并且声明为静态的。
    static DataSource source1;
    static {
        try {
            Properties pros = new Properties();
            FileInputStream fis = new FileInputStream("src/druid.properties");
            pros.load(fis);

            source1 = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnectionBasedDruid() throws SQLException {

        Connection conn = source1.getConnection();
        return conn;
    }

    /*
    * 关闭资源方式1
    */
    public static void closeSource(Connection connection, PreparedStatement ps) {
        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeSource(Connection connection, PreparedStatement ps, ResultSet resultSet) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (resultSet != null)
                resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
     * 关闭资源方式2：使用dbutils．jar中提供的DbUtils工具类，实现资源的关闭，会抛出异常
     */
    public static void closeSourceBasedDbUtils1(Connection conn, PreparedStatement ps, ResultSet resultset) throws SQLException {
        DbUtils.close(conn);
        DbUtils.close(ps);
        DbUtils.close(resultset);
    }

    /*
     * 关闭资源方式3：使用dbutils．jar中提供的Dbutils工具类，实现资源的关闭，不会抛出异常（因为方法内部处理了异常）
     */
    public static void closeSourceBasedDbUtils2(Connection conn, PreparedStatement ps, ResultSet resultset){
        DbUtils.closeQuietly(conn);
        DbUtils.closeQuietly(ps);
        DbUtils.closeQuietly(resultset);
    }
}

