package com.example.System.Video;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;


    /**
    * @param name 姓名
    * */
    public static void insertMember(String name, String sfzh, String xb,
                             String sr, String lxdh, String jtzz) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String insertMember = "INSERT INTO member (name, sfzh, xb, sr, lxdh, jtzz) VALUES ( ?,?,?,?,?,? )";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(insertMember);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,sfzh);
            preparedStatement.setString(3,xb);
            preparedStatement.setString(4,sr);
            preparedStatement.setString(5,lxdh);
            preparedStatement.setString(6,jtzz);
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

    public static void insertOrder(String ddbh, String tcbh, String tcmc, String hyxm, String hysfzh, String yysbh, String yysmc) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO orderTable (ddbh, tcbh, tcmc, hyxm, hysfzh, yysbh, yysmc) VALUES (?,?,?,?,?,?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ddbh);
            preparedStatement.setString(2,tcbh);
            preparedStatement.setString(3,tcmc);
            preparedStatement.setString(4,hyxm);
            preparedStatement.setString(5,hysfzh);
            preparedStatement.setString(6,yysbh);
            preparedStatement.setString(7,yysmc);
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

    public static void insertPackage(String tcbh, String tcmc, String cjbh, String cjmc, String gmrq, String sxrq) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO package (tcbh, tcmc, cjbh, cjmc, gmrq, sxrq) VALUES (?,?,?,?,?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tcbh);
            preparedStatement.setString(2,tcmc);
            preparedStatement.setString(3,cjbh);
            preparedStatement.setString(4,cjmc);
            preparedStatement.setString(5,gmrq);
            preparedStatement.setString(6,sxrq);
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

    public static void insertFactory(String cjbh, String cjmc, String cjdz, String lxdh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO factory (cjbh, cjmc, cjdz, lxdh) VALUES (?,?,?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cjbh);
            preparedStatement.setString(2,cjmc);
            preparedStatement.setString(3,cjdz);
            preparedStatement.setString(4,lxdh);
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

    public static void insertOperator(String yysbh, String yysmc, String yysdz, String yyslxdh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO operator (yysbh, yysmc, yysdz, yyslxdh) VALUES (?,?,?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,yysbh);
            preparedStatement.setString(2,yysmc);
            preparedStatement.setString(3,yysdz);
            preparedStatement.setString(4,yyslxdh);
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
