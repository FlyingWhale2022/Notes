package com.oxygen1.getconnection;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Enthusiasm
 * @Description 创建与数据库的连接，总体分两大类：1、手动创建；2、数据连接池中获取。
 * @creat 2022/5/25-9:54
 */
public class GetConnectionFinal {
    /*
     * 创建连接方式1：自己创建连接，用完即销毁，效率低，占用资源。
     */
    public static Connection getConnection() throws Exception {
        //读取配置文件
        Properties pos = new Properties();
        InputStream ips = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        pos.load(ips);

        String driverClass = pos.getProperty("driverClass");
        String user = pos.getProperty("user");
        String password = pos.getProperty("password");
        String url = pos.getProperty("url");

        //加载Driver,生成并注册驱动
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
    static DataSource source;
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
}
