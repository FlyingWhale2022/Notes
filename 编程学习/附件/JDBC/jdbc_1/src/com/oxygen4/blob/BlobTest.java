package com.oxygen4.blob;

import com.oxygen2.utils.JDBCUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Description 利用Blob在数据库和内存之间传输二进制文件
 * @author Enthusiasm
 * @creat 2022/5/19-23:01
 */
public class BlobTest {

    /*
    * 将数据库的图片传到内存中
    */
    @Test
    public void inputTest()  {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        InputStream binaryStream = null;
        FileOutputStream fos = null;
        try {
            //获取连接
            connection = JDBCUtils.getConnection();

            String sql = "select photo from customers where id = ?";
            //预编译
            ps = connection.prepareStatement(sql);
            //填充占位符
            ps.setObject(1,16);
            //执行，获取结果集
            resultSet = ps.executeQuery();

            if(resultSet.next()){
                Blob photo = resultSet.getBlob("photo");
                //获取输入流
                binaryStream = photo.getBinaryStream();
                //以下是IO流的操作，将图片加载到内存中
                fos = new FileOutputStream("朱茵.jpg");

                byte[] buffer = new byte[100];
                int len ;
                while((len = binaryStream.read(buffer)) != -1){
                    fos.write(buffer,0,len);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(binaryStream != null)
                binaryStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JDBCUtils.closeSource(connection,ps,resultSet);
        }

    }

    /*
    * 将内存中的图片传到数据库中
    */
    @Test
    public void outputTest() throws Exception {
        Connection connection = JDBCUtils.getConnection();

        String sql = "insert into customers(name,email,birth,photo) values(?,?,?,?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setObject(1,"朱博能");
        ps.setObject(2,"zbn@126.com");
        ps.setObject(3,"2021-12-21");
        //Blob类型的占位符要用FileInputStream来填充
        FileInputStream fis = new FileInputStream("证件照.png");
        ps.setObject(4,fis);

        ps.execute();

        fis.close();
        JDBCUtils.closeSource(connection,ps);

    }
}
