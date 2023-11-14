package com.oxygen8.connectionpool;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/24-16:22
 */
public class DruidTest {

    /*
     * 使用配置文件的方式：将数据库和连接池的信息放在配置文件中（推荐）
     */
    @Test
    public void getConnection() throws Exception {
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("src/druid.properties");
        pros.load(fis);

        DataSource source = DruidDataSourceFactory.createDataSource(pros);
        Connection conn = source.getConnection();

        System.out.println(conn);
    }
}
