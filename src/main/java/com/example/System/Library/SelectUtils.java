package com.example.System.Library;

import java.sql.*;

public class SelectUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;

    public static void selectBook(String sfzh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from Books WHERE BookID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,sfzh);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String BookID = resultSet.getString(1);
                String AuthorID = resultSet.getString(2);
                String Title = resultSet.getString(3);
                String ISBN = resultSet.getString(4);
                String PublicationYear = resultSet.getString(5);
                System.out.println("BookID=" + BookID + "，AuthorID=" + AuthorID + "，Title=" + Title + "，ISBN=" + ISBN
                        + "，PublicationYear=" + PublicationYear);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void selectAuthor(String AuthorID) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from Authors WHERE AuthorID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,AuthorID);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String AuthorID1 = resultSet.getString(1);
                String AuthorName = resultSet.getString(2);
                System.out.println("AuthorID1=" + AuthorID1 + "，AuthorName=" + AuthorName);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void selectReader(String ReaderID) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from Readers WHERE ReaderID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ReaderID);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String ReaderID1 = resultSet.getString(1);
                String ReaderName = resultSet.getString(2);
                String Email = resultSet.getString(3);
                String Phone = resultSet.getString(4);
                System.out.println("ReaderID=" + ReaderID1 + "，ReaderName=" + ReaderName + "，Email=" + Email + "，Phone=" + Phone);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void selectCategory(String CategoryID) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from BookCategories WHERE CategoryID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,CategoryID);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String CategoryID1 = resultSet.getString(1);
                String CategoryName = resultSet.getString(2);
                System.out.println("CategoryID=" + CategoryID1 + "，CategoryName=" + CategoryName);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (resultSet != null)
                    resultSet.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void selectLoan(String LoanID) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from BookLoans WHERE LoanID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,LoanID);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String LoanID1 = resultSet.getString(1);
                String BookID = resultSet.getString(2);
                String ReaderID = resultSet.getString(3);
                String LoanDate = resultSet.getString(4);
                String ReturnDate = resultSet.getString(4);
                System.out.println("LoanID=" + LoanID1 + "，BookID=" + BookID + "，ReaderID=" + ReaderID + "，LoanDate=" + LoanDate
                        + "，ReturnDate=" + ReturnDate);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭连接和Statement对象。
                if (resultSet != null)
                    resultSet.close();
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
