package com.example.System.Video;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;

    public static void updateMember(String xsfzh, String sfzh, String name, String lxdh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String updateMember = "update member set name = ?, sfzh = ?, lxdh = ? WHERE sfzh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(updateMember);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,sfzh);
            preparedStatement.setString(3,lxdh);
            preparedStatement.setString(4,xsfzh);
            preparedStatement.executeUpdate();

            String updateOrder = "update orderTable set hyxm = ?, hysfzh = ? WHERE hysfzh = ?";
            preparedStatement = connection.prepareStatement(updateOrder);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,sfzh);
            preparedStatement.setString(3,xsfzh);
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

    public static void updateOrder(String ddbh, String xtcbh, String tcbh, String tcmc) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update orderTable set tcbh = ?,tcmc = ? WHERE ddbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tcbh);
            preparedStatement.setString(2,tcmc);
            preparedStatement.setString(3,ddbh);
            preparedStatement.executeUpdate();

            // 插入记录
            String sql1 = "update package set tcbh = ?, tcmc = ? WHERE tcbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,tcbh);
            preparedStatement.setString(2,tcmc);
            preparedStatement.setString(3,xtcbh);
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

    public static void updatePackage(String xtcbh, String tcbh, String tcmc) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update package set tcbh = ?,tcmc = ? WHERE tcbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tcbh);
            preparedStatement.setString(2,tcmc);
            preparedStatement.setString(3,xtcbh);
            preparedStatement.executeUpdate();

            // 插入记录
            String sql1 = "update orderTable set tcbh = ?, tcmc = ? WHERE tcbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,tcbh);
            preparedStatement.setString(2,tcmc);
            preparedStatement.setString(3,xtcbh);
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

    public static void updateFactory(String xcjbh, String cjbh, String cjmc) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update factory set cjbh = ?,cjmc = ? WHERE cjbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cjbh);
            preparedStatement.setString(2,cjmc);
            preparedStatement.setString(3,xcjbh);
            preparedStatement.executeUpdate();

            // 插入记录
            String sql1 = "update package set cjbh = ?, cjmc = ? WHERE cjbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,cjbh);
            preparedStatement.setString(2,cjmc);
            preparedStatement.setString(3,xcjbh);
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

    public static void updateOperator(String xyysbh, String yysbh, String yysmc) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update operator set yysbh = ?,yysmc = ? WHERE yysbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,yysbh);
            preparedStatement.setString(2,yysmc);
            preparedStatement.setString(3,xyysbh);
            preparedStatement.executeUpdate();

            // 插入记录
            String sql1 = "update orderTable set yysbh = ?, yysmc = ? WHERE yysbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,yysbh);
            preparedStatement.setString(2,yysmc);
            preparedStatement.setString(3,xyysbh);
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
