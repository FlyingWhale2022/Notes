package com.oxygen7.dao;

import com.oxygen2.utils.JDBCUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Enthusiasm
 * @Description 抽象类，封装了通用的增删改查操作
 * @creat 2022/5/23-17:08
 */

public abstract class BaseDAO<T> {  //DAO:Datebase access Object(数据库访问对象)

    Class<T> clazz = null;
    //获取子类的对象的实例化泛型
    {
        //获取当前BaseDAO的子类继承的父类中的泛型
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //获取了父类的泛型参数
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
        //泛型的第一个参数
        clazz = (Class<T>) actualTypeArguments[0];
    }

    /*
     * 通用的查询操作，用于返回数据表中的多条记录构成的集合（考虑了事务）
     */
    public List<T> getList(Connection conn, String sql, Object... args) {


        PreparedStatement ps = null;
        ResultSet resultSet = null;
        List<T> tlist = null;
        try {
            //建立连接，预编译SQL语句
            ps = conn.prepareStatement(sql);

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
     *通用的查询操作，用于返回数据表中的一条记录构成的集合（考虑了事务）
     */
    public T getInstance(Connection conn, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            //建立连接，预编译SQL语句
            ps = conn.prepareStatement(sql);

            //填充占位符
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            resultSet = ps.executeQuery();  //得到查询的结果集
            ResultSetMetaData metaData = resultSet.getMetaData(); //获得元数据
            int columnCount = metaData.getColumnCount();

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
                //将该对象返回
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(null, ps, resultSet);
        }
        return null;
    }

    /*
     * 通用的增删改操作（考虑了事务）
     */
    public void update(Connection conn, String sql, Object... args) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(null, ps);
        }

    }

    /*
     *用于查询特殊值的通用方法（考虑了事务）
     */
    public <E> E getValue(Connection conn, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return (E) resultSet.getObject(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(null, ps, resultSet);
        }
        return null;
    }
}
