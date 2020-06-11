package com.zzf.demo01;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/2 17:00
 * @description
 * jdbc代码示例
 */
public class JdbcDemo01 {
    public static String urlprefix="jdbc:mysql://localhost:3306/";
    public static String username="root";
    public static String password="zzf";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String dbname="test";
        //1.注册驱动
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection(urlprefix+dbname,username,password);
        //3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        //4.执行sql语句获得结果集
        ResultSet resultSet = pstm.executeQuery();
        //5.遍历结果集
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //6.释放资源
        resultSet.close();
        pstm.close();
        conn.close();
    }
}
