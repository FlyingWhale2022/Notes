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
 * @creat 2022/5/19-17:19
 */
public class PrepareStatementQuery {

    /*
    * 不考虑事务，查询结果为多条记录
    */
    public static <T> List<T> getList(Class<T> clazz,String sql,Object... args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        List<T> tlist = null;
        try {
            //建立连接，预编译SQL语句
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);

            //填充占位符
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1,args[i]);
            }

            //得到查询的结果集
            resultSet = ps.executeQuery();
            //获得元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取列数
            int columnCount = metaData.getColumnCount();
            tlist = new ArrayList<>();

            while(resultSet.next()){
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //获取列的值
                    Object columnValue = resultSet.getObject(i + 1);
                    //利用反射给对象的某个属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t,columnValue);
                }
                //将对象加入集合中
                tlist.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(connection,ps,resultSet);
            return tlist;
        }

    }

    /*
    * 不考虑事务，查询结果为一条记录
    */
    public static <T> T getInstance(Class<T> clazz,String sql,Object... args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            //建立连接，预编译SQL语句
            connection = JDBCUtils.getConnection();
            ps = connection.prepareStatement(sql);

            //填充占位符
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1,args[i]);
            }

            //得到查询的结果集
            resultSet = ps.executeQuery();
            //获得元数据
            ResultSetMetaData metaData = resultSet.getMetaData();
            //获取列数
            int columnCount = metaData.getColumnCount();

            if(resultSet.next()){
                T t = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //获取列的别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //获取列的值
                    Object columnValue = resultSet.getObject(i + 1);
                    //利用反射给对象的某个属性赋值
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t,columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(connection,ps,resultSet);
        }
        return null;
    }
}
