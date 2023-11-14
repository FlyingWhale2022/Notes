package com.oxygen3.basicoperate;

import com.oxygen2.utils.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Enthusiasm
 * @Description 考虑了事务，需要在方法里传进Connection对象，而不是在方法里造连接
 * @creat 2022/5/23-13:12
 */
public class QueryForTransaction {
    /*
     * 考虑事务，查询结果为多条记录
     */
    public static <T> List<T> getList(Connection connection, Class<T> clazz, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        List<T> tlist = null;
        try {
            //建立连接，预编译SQL语句
            ps = connection.prepareStatement(sql);

            //填充占位符
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            resultSet = ps.executeQuery();  //得到查询的结果集
            ResultSetMetaData metaData = resultSet.getMetaData(); //获得元数据
            int columnCount = metaData.getColumnCount();  //获取列数
            tlist = new ArrayList<>();

            while (resultSet.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //获取列的值
                    Object columnValue = resultSet.getObject(i + 1);
                    //利用反射给对象的某个属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                //将对象加入集合中
                tlist.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(null, ps, resultSet);
            return tlist;
        }
    }

    /*
     * 考虑事务，查询结果为一条记录
     */
    public static <T> T getInstance(Connection connection, Class<T> clazz, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            //建立连接，预编译SQL语句
            ps = connection.prepareStatement(sql);

            //填充占位符
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            resultSet = ps.executeQuery();  //得到查询的结果集
            ResultSetMetaData metaData = resultSet.getMetaData(); //获得元数据
            int columnCount = metaData.getColumnCount();  //获取列数

            if (resultSet.next()) {
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //获取列的值
                    Object columnValue = resultSet.getObject(i + 1);
                    //利用反射给对象的某个属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t, columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(null, ps, resultSet);
        }
        return null;
    }
}
