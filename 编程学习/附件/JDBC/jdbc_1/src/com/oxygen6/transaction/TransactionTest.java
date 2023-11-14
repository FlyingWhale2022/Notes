package com.oxygen6.transaction;

import com.oxygen.bean.Goods;
import com.oxygen2.utils.JDBCUtils;
import com.oxygen3.basicoperate.QueryForTransaction;
import com.oxygen3.basicoperate.UpdateForTransaction;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @author Enthusiasm
 * @creat 2022/5/20-20:25
 */
public class TransactionTest {
    @Test
    public void test1() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        //关闭自动提交
        connection.setAutoCommit(false);
        //设定隔离级别为：read uncommitted
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

        String sql = "select * from goods";
        List<Goods> query = QueryForTransaction.getList(connection, Goods.class, sql);

        for(Goods goods : query){
            System.out.println(goods);
        }
    }
    @Test
    public void test2() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        connection.setAutoCommit(false);
        String sql = "insert into goods(name) values ('LiHua')";
        UpdateForTransaction.update(connection,sql);
        Thread.sleep(15000L);
    }
}


