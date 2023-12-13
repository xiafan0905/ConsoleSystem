package com.example.System.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;

    public static void updateBook(String xsjid, String sjid, String zzid, String fbrq, String ibsn, String sm) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String updateMember = "update Books set BookID = ?, AuthorID = ?, Title = ?, ISBN = ?, PublicationYear = ? WHERE BookID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(updateMember);
            preparedStatement.setString(1,sjid);
            preparedStatement.setString(2,zzid);
            preparedStatement.setString(3,sm);
            preparedStatement.setString(4,ibsn);
            preparedStatement.setString(5,fbrq);
            preparedStatement.setString(6,xsjid);
            preparedStatement.executeUpdate();

            String sql = "update BookLoans set BookID = ? where BookID = ?";
            preparedStatement = connection.prepareStatement(updateMember);
            preparedStatement.setString(1,sjid);
            preparedStatement.setString(2,xsjid);
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

    public static void updateAuthor(String xzz, String zz, String zzname) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update Authors set AuthorID = ?,AuthorName = ? WHERE AuthorID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,zz);
            preparedStatement.setString(2,zzname);
            preparedStatement.setString(3,xzz);
            preparedStatement.executeUpdate();

            // 插入记录
            String sql1 = "update Books set AuthorID = ? WHERE AuthorID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,zz);
            preparedStatement.setString(2,xzz);
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

    public static void updateReader(String xReaderID, String ReaderID, String ReaderName) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update Readers set ReaderID = ?,ReaderName = ? WHERE ReaderID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ReaderID);
            preparedStatement.setString(2,ReaderName);
            preparedStatement.setString(3,xReaderID);
            preparedStatement.executeUpdate();

            // 插入记录
            String sql1 = "update BookLoans set ReaderID = ? WHERE ReaderID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1,ReaderID);
            preparedStatement.setString(2,xReaderID);
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

    public static void updateCategory(String xCategoryID, String CategoryID, String CategoryName) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update BookCategories set CategoryID = ?,CategoryName = ? WHERE CategoryID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,CategoryID);
            preparedStatement.setString(2,CategoryName);
            preparedStatement.setString(3,xCategoryID);
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

    public static void updateLoan(String LoanID, String BookID, String ReaderID, String LoanDate, String ReturnDate) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "update BookLoans set BookID = ?,ReaderID = ?, LoanDate = ?, ReturnDate = ? WHERE LoanID = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,BookID);
            preparedStatement.setString(2,ReaderID);
            preparedStatement.setString(3,LoanDate);
            preparedStatement.setString(4,ReturnDate);
            preparedStatement.setString(5,LoanID);
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
