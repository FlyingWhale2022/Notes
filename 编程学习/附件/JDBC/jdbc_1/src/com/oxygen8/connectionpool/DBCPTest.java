package com.oxygen8.connectionpool;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/24-11:43
 */
public class DBCPTest {

    /*
     * 方式一：将数据库和连接池的信息暴露在外面，移植性差（不推荐）
     */
    @Test
    public void getConnection1() throws SQLException {
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName("com.mysql.cj.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/test");
        source.setUsername("root");
        source.setPassword("abc123");
        Connection connection = source.getConnection();
        System.out.println(connection);

    }

    /*
     * 方式2：使用配置文件的方式：将数据库和连接池的信息放在配置文件中（推荐）
     */
    @Test
    public void getConnection2() throws Exception {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("src/dbcp.properties");
        pros.load(fis);

        DataSource source = BasicDataSourceFactory.createDataSource(pros);
        Connection conn = source.getConnection();

        System.out.println(conn);
    }

}
