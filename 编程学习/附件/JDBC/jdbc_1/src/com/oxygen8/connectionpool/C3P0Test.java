package com.oxygen8.connectionpool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/24-10:57
 */
public class C3P0Test {
    /*
    * 方式一：将数据库和连接池的信息暴露在外面，移植性差（不推荐）
    */
    @Test
    public void getConnectionTest1() throws SQLException, PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        cpds.setUser("root");
        cpds.setPassword("abc123");

        //通过设置相关的参数，对数据库连接池进行管理：
        //设置初始时数据库连接池中的连接数
        cpds.setMaxPoolSize(100);

        Connection conn = cpds.getConnection();
        System.out.println(conn);
    }


    /*
    * 方式2：使用配置文件的方式：将数据库和连接池的信息放在配置文件中（推荐）
    */
    //连接池只造一个，因此声明在方法外，且为静态的。
    private static ComboPooledDataSource cpds = new ComboPooledDataSource("helloc3p0");//这里要和xml文件里的名字对上
    @Test
    public void getConnectionTest2() throws SQLException {

        Connection conn = cpds.getConnection();
        System.out.println(conn);
    }
}
