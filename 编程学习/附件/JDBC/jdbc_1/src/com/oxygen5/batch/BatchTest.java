package com.oxygen5.batch;

import com.oxygen2.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author Enthusiasm
 * @Description
 * @creat 2022/5/25-12:07
 */
public class BatchTest {
    /*
     * 实现层次一：利用循环语句
     */
    @Test
    public void test1() throws Exception {
        //记录开始时间
        long start = System.currentTimeMillis();

        Connection conn = JDBCUtils.getConnection();

        String sql = "insert into goods(name)values(?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        //利用循环语句进行批量操作
        for (int i = 1; i <= 20000; i++) {
            ps.setString(1, "name_" + i);
            ps.executeUpdate();
        }
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));//82340

        JDBCUtils.closeSource(conn, ps);
    }

    /*
     * 实现层次二
     * 修改1： 使用 addBatch() / executeBatch() / clearBatch()
     * 修改2：mysql服务器默认是关闭批处理的，我们需要通过一个参数，让mysql开启批处理的支持。
     *       ?rewriteBatchedStatements=true 写在配置文件的url后面
     * 修改3：使用更新的mysql 驱动：mysql-connector-java-8.0.29.jar
     */
    @Test
    public void test2() throws Exception {
        long start = System.currentTimeMillis();

        Connection conn = JDBCUtils.getConnection();

        String sql = "insert into goods(name)values(?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        for (int i = 1; i <= 1000000; i++) {
            ps.setString(1, "name_" + i);

            //1.“攒”sql
            ps.addBatch();
            if (i % 500 == 0) {
                //2.执行
                ps.executeBatch();
                //3.清空
                ps.clearBatch();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));//20000条：625                                                                         //1000000条:14733

        JDBCUtils.closeSource(conn, ps);
    }


    /*
     * 层次三：在层次二的基础上操作
     * 使用Connection 的 setAutoCommit(false)  /  commit()
     */
    @Test
    public void testfinal() throws Exception{
        long start = System.currentTimeMillis();

        Connection conn = JDBCUtils.getConnection();

        //1.设置为不自动提交数据
        conn.setAutoCommit(false);

        String sql = "insert into goods(name)values(?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        for(int i = 1;i <= 1000000;i++){
            ps.setString(1, "name_" + i);

            //1.“攒”sql
            ps.addBatch();

            if(i % 500 == 0){
                //2.执行
                ps.executeBatch();
                //3.清空
                ps.clearBatch();
            }
        }

        //2.提交数据
        conn.commit();

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));//1000000条:4978

        JDBCUtils.closeSource(conn, ps);
    }
}
