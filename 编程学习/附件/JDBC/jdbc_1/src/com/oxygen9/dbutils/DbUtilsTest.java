package com.oxygen9.dbutils;

import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Enthusiasm
 * @Description 使用dbutils．jar中提供的Dbutils工具类，实现资源的关闭
 * @creat 2022/5/25-9:31
 */
public class DbUtilsTest {
    /*
    * 关闭资源方式一：会抛出异常
    */
    public static void closeSource1(Connection conn, PreparedStatement ps, ResultSet resultset) throws SQLException {
        DbUtils.close(conn);
        DbUtils.close(ps);
        DbUtils.close(resultset);
    }

    /*
    * 关闭资源方式二：不会抛出异常（因为方法内部处理了异常）
    */
    public static void closeSource2(Connection conn, PreparedStatement ps, ResultSet resultset){
        DbUtils.closeQuietly(conn);
        DbUtils.closeQuietly(ps);
        DbUtils.closeQuietly(resultset);
    }
}
