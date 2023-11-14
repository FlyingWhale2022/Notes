package com.oxygen3.basicoperate;

import com.oxygen2.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @Description 考虑了事务，需要在方法里传进Connection对象，而不是在方法里造连接
 * @author Enthusiasm
 * @creat 2022/5/20-20:23
 */
public class UpdateForTransaction {
    public static void update(Connection connection,String sql, Object... args) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);

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
}
