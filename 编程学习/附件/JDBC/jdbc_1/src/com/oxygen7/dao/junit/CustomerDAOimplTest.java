package com.oxygen7.dao.junit;

import com.oxygen.bean.Customer;
import com.oxygen7.dao.CustomerDAOimpl;
import com.oxygen2.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/23-21:10
 */
public class CustomerDAOimplTest {
    CustomerDAOimpl dao = new CustomerDAOimpl();
    @Test
    public void insert()  {
        Connection conn = null;
        try {
            conn = JDBCUtils.getConnectionBasedDruid();

            dao.insert(conn,new Customer(0,"James","email",new Date(123456789L)));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeSource(conn,null);
        }


    }

    @Test
    public void deleteById() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getCustomerById() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getCount() {
    }

    @Test
    public void getMaxBirth() {
    }
}