package com.example.System.Video;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;

    public static void deleteMember(String sfzh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "DELETE FROM member WHERE sfzh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,sfzh);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteOrder(String ddbh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "DELETE FROM orderTable WHERE ddbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ddbh);
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
