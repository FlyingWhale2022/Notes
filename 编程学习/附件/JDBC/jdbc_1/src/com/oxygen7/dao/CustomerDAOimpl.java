package com.oxygen7.dao;

import com.oxygen.bean.Customer;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/23-18:20
 */
public class CustomerDAOimpl extends BaseDAO<Customer> implements CustomerDAO {
    @Override
    public void insert(Connection conn, Customer cus) {
        String sql = "insert into customers(id,name,email,birth) values (?,?,?,?)";
        update(conn, sql, cus.getId(), cus.getName(), cus.getEmail(), cus.getBirth());
    }

    @Override
    public void deleteById(Connection conn, int id) {
        String sql = "delete from customers where id = ?";
        update(conn, sql, id);
    }

    @Override
    public void update(Connection conn, Customer cus) {
        String sql = "update customers set name = ?,email = ?,birth = ? where id = ?";
        update(conn, sql, cus.getName(), cus.getEmail(), cus.getBirth(), cus.getId());

    }

    @Override
    public Customer getCustomerById(Connection conn, int id) {
        String sql = "select * from customers where id = ?";
        return getInstance(conn, sql, id);
    }

    @Override
    public List<Customer> getAll(Connection conn) {
        String sql = "select * from customers";
        return getList(conn, sql);
    }

    @Override
    public Long getCount(Connection conn) {
        String sql = "select count(*) from customers";
        return getValue(conn, sql);
    }

    @Override
    public Date getMaxBirth(Connection conn) {
        String sql = "select max(birth) from customers";
        return getValue(conn, sql);
    }
}
