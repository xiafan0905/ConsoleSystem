package com.example.System.Video;

import java.sql.*;

public class SelectUtils {

    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;

    public static void selectMember(String sfzh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from member WHERE sfzh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,sfzh);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String name = resultSet.getString(1);
                String sfzh1 = resultSet.getString(2);
                String xb = resultSet.getString(3);
                String sr = resultSet.getString(4);
                String lxdh = resultSet.getString(5);
                String jtzz = resultSet.getString(6);
                System.out.println("会员姓名=" + name + "，会员身份证号=" + sfzh1 + "，会员性别=" + xb + "，会员生日=" + sr
                        + "，会员联系电话=" + lxdh+ "，会员家庭住址=" + jtzz);
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

    public static void selectOrder(String ddbh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from orderTable WHERE ddbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,ddbh);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String ddbh1 = resultSet.getString(1);
                String tcbh = resultSet.getString(2);
                String tcmc = resultSet.getString(3);
                String hyxm = resultSet.getString(4);
                String hysfzh = resultSet.getString(5);
                String yysbh = resultSet.getString(6);
                String yysmc = resultSet.getString(7);
                System.out.println("订单编号=" + ddbh1 + "，套餐编号=" + tcbh + "，套餐名称=" + tcmc + "，会员姓名=" + hyxm
                        + "，会员身份证号=" + hysfzh+ "，运营商编号=" + yysbh + "，运营商名称=" + yysmc);
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

    public static void selectPackage(String tcbh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from package WHERE tcbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tcbh);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String tcbh1 = resultSet.getString(1);
                String tcmc = resultSet.getString(2);
                String cjbh = resultSet.getString(3);
                String cjmc = resultSet.getString(4);
                String gmrq = resultSet.getString(5);
                String sxrq = resultSet.getString(6);
                System.out.println("套餐编号=" + tcbh1 + "，套餐名称=" + tcmc + "，厂家编号=" + cjbh + "，厂家名称=" + cjmc
                        + "，购买日期=" + gmrq+ "，失效日期=" + sxrq);
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

    public static void selectFactory(String cjbh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from factory WHERE cjbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,cjbh);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String cjbh1 = resultSet.getString(1);
                String cjmc = resultSet.getString(2);
                String cjdz = resultSet.getString(3);
                String lxdh = resultSet.getString(4);
                System.out.println("厂家编号=" + cjbh1 + "，厂家名称=" + cjmc + "，厂家地址=" + cjdz + "，厂家联系电话=" + lxdh);
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

    public static void selectOperator(String yysbh) {
        try {
            // 注册mysql的JDBC驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnit","root","beyourSelf95.");
            // 插入记录
            String sql = "select * from operator WHERE yysbh = ?";
            // 创建PreparedStatement对象
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,yysbh);
            //3.执行,并返回结果集
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                //获取当前这条数据的各个字段值
                String yysbh1 = resultSet.getString(1);
                String yysmc = resultSet.getString(2);
                String yysdz = resultSet.getString(3);
                String yyslxdh = resultSet.getString(4);
                System.out.println("运营商编号=" + yysbh1 + "，运营商名称=" + yysmc + "，运营商地址=" + yysdz + "，运营商联系电话=" + yyslxdh);
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
