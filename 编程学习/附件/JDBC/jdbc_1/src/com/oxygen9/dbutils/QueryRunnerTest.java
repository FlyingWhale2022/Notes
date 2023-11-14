package com.oxygen9.dbutils;

import com.oxygen.bean.Customer;
import com.oxygen2.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Enthusiasm
 * @Description 利用QueryRunner类实现基本的增删改查操作
 * @creat 2022/5/24-18:27
 */
public class QueryRunnerTest {
    /*
    * 示范插入操作（删除、更新的操作是一样的）
    */
    @Test
    public void insertTest() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "insert into customers(name,email,birth) values (?,?,?)";

        queryRunner.update(conn,sql,"鹿晗","luhan@qq.com","1998-2-21");

        JDBCUtils.closeSource(conn,null);
    }

    /*
    * 查询一条记录
    * BeanHandler：ResultSetHandler接口的实现类，用以封装表的一条记录
    */
    @Test
    public void queryWithBeanFormal() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select name,email,birth from customers where id = ?";

        //BeanHandler：ResultSetHandler接口的实现类，用以封装表的一条记录
        BeanHandler<Customer> beanHandler = new BeanHandler(Customer.class);

        Customer result = queryRunner.query(conn, sql, 12, beanHandler);
        System.out.println(result);
    }

    /*
     * 查询一条记录
     * MapHandler：ResultSetHandler接口的实现类，对应表中的一条记录。
     * 将字段及相应的字段的值作为Map中的key和value
     */
    @Test
    public void queryWithMapFormal() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select name,email,birth from customers where id = ?";

        //MapHandler：ResultSetHandler接口的实现类，对应表中的一条记录。
        MapHandler mapHandler = new MapHandler();

        Map<String, Object> result = queryRunner.query(conn, sql, 12, mapHandler);
        System.out.println(result);
    }

    /*
     * 查询多条记录
     * BeanListHandler：ResultSetHandler接口的实现类，用以封装表的多条记录
     */
    @Test
    public void queryWithBeanListFormal() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select id,name,email,birth from customers where id < ?";

        //BeanListHandler：ResultSetHandler接口的实现类，用以封装表的多条记录
        BeanListHandler<Customer> beanListHandler = new BeanListHandler(Customer.class);

        List<Customer> result = queryRunner.query(conn, sql, 12, beanListHandler);

        for (Customer customer : result){
            System.out.println(customer);
        }
    }

    /*
     * 查询多条记录
     * MapListHandler：ResultSetHandler接口的实现类，对应表中的多条记录
     * 字段及相应的字段的值作为Map中的key和value
     */
    @Test
    public void queryWithMapListFormal() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select name,email,birth from customers where id < ?";

        //MapListHandler：ResultSetHandler接口的实现类，对应表中的多条记录
        MapListHandler mapListHandler = new MapListHandler();

        List<Map<String, Object>> result = queryRunner.query(conn, sql, 12, mapListHandler);

        for(Map<String, Object> customer : result){
            System.out.println(customer);
        }
    }

    /*
    * ScalarHandler：ResultSetHandler接口的实现类，用于查询特殊值
    */
    @Test
    public void queryWithScalarFormal() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select max(birth) from customers";

        ScalarHandler scalarHandler = new ScalarHandler();
        Date result = (Date)queryRunner.query(conn, sql, scalarHandler);
        System.out.println(result);
    }

    /*
    * 自定义ResultSetHandler的实现类
    * ResultSetHandler接口的本质是对查询的结果集ResultSet进行处理
    */
    @Test
    public void queryWithCustomFormal() throws SQLException {
        Connection conn = JDBCUtils.getConnectionBasedDruid();
        String sql = "select id,name,email,birth from customers where id =1";

        //自定义ResultSetHandler匿名实现类的对象
        //需要重写其中的handle（）方法
        //本质是对查询的结果集ResultSet进行处理
        ResultSetHandler<Customer> handler = new ResultSetHandler<Customer>(){
            @Override
            public Customer handle(ResultSet resultSet) throws SQLException {
                if(resultSet.next()){
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    String email = resultSet.getString(3);
                    Date birth = resultSet.getDate(4);
                    Customer customer = new Customer(id, name, email, birth);
                    return customer;

                }
                return null;
            }
        };

        QueryRunner queryRunner = new QueryRunner();
        Customer result = queryRunner.query(conn, sql, handler);

        System.out.println(result);

        JDBCUtils.closeSource(conn,null);

    }

}
