package com.example.System.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;

    public static void insertBook(String sjid, String sm, String ibsn,
                             String fbrq, String zzid) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String insertMember = "INSERT INTO Books (BookID, Title, AuthorID, ISBN, PublicationYear) VALUES ( ?,?,?,?,? )";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(insertMember);
            preparedStatement.setString(1,sjid);
            preparedStatement.setString(2,sm);
            preparedStatement.setString(3,zzid);
            preparedStatement.setString(4,ibsn);
            preparedStatement.setString(5,fbrq);
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

    public static void insertAuthor(String authorID, String authorName) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO Authors (AuthorID, AuthorName) VALUES (?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,authorID);
            preparedStatement.setString(2,authorName);
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

    public static void insertReader(String ReaderID, String ReaderName, String Email, String Phone) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO Readers (ReaderID, ReaderName, Email, Phone) VALUES (?,?,?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ReaderID);
            preparedStatement.setString(2,ReaderName);
            preparedStatement.setString(3,Email);
            preparedStatement.setString(4,Phone);
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

    public static void insertCategory(String CategoryID, String CategoryName) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO BookCategories (CategoryID, CategoryName) VALUES (?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,CategoryID);
            preparedStatement.setString(2,CategoryName);
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

    public static void insertLoan(String LoanID, String BookID, String ReaderID, String LoanDate, String ReturnDate) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "INSERT INTO BookLoans (LoanID, BookID, ReaderID, LoanDate,ReturnDate) VALUES (?,?,?,?,?)";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,LoanID);
            preparedStatement.setString(2,BookID);
            preparedStatement.setString(3,ReaderID);
            preparedStatement.setString(4,LoanDate);
            preparedStatement.setString(4,ReturnDate);
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
