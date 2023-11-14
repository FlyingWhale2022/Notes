package com.oxygen7.dao;

import com.oxygen.bean.Customer;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/23-17:56
 */
public interface CustomerDAO {
    /*
    * 将cust对象插入表中
    */
    void insert (Connection conn, Customer cus);
    /*
    * 针对指定的id，删除相应的记录
    */
    void deleteById(Connection conn,int id);
    /*
    * 根据cust对象，修改表中的相应的记录
    */
    void update(Connection conn,Customer cus);
    /*
    * 根据id查询相应的一条记录
    */
    Customer getCustomerById(Connection conn,int id);
    /*
    * 查询表中的所有记录
    */
    List<Customer> getAll(Connection conn);
    /*
    * 返回数据表中的数据条目数
    */
    Long getCount(Connection conn);
    /*
    * 返回数据表中的最大的生日
    */
    Date getMaxBirth(Connection conn);
}
