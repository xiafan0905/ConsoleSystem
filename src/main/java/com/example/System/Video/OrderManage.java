package com.example.System.Video;

import java.util.Scanner;

public class OrderManage {

    public static void manage(){
        System.out.println("====     1-添加订单     ====");
        System.out.println("====     2-删除订单     ====");
        System.out.println("====     3-更新订单     ====");
        System.out.println("====     4-查询订单     ====");
        System.out.println("====       5-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入订单编号:");
            String ddbh = scanner.next();
            System.out.println("请输入套餐编号:");
            String tcbh = scanner.next();
            System.out.println("请输入套餐名称:");
            String tcmc = scanner.next();
            System.out.println("请输入会员姓名:");
            String hyxm = scanner.next();
            System.out.println("请输入会员身份证号:");
            String sfzh = scanner.next();
            System.out.println("请输入运营商编号:");
            String yysbh = scanner.next();
            System.out.println("请输入运营商名称:");
            String yysmc = scanner.next();
            InsertUtils.insertOrder(ddbh,tcbh,tcmc,hyxm,sfzh,yysbh,yysmc);
            System.out.println("添加订单信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入删除订单编号:");
            String ddbh = scanner.next();
            DeleteUtils.deleteOrder(ddbh);
            System.out.println("删除订单信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入更新订单编号:");
            String ddbh = scanner.next();
            System.out.println("请输入要修改的套餐编号:");
            String xtcbh = scanner.next();
            System.out.println("请输入修改后的套餐编号:");
            String tcbh = scanner.next();
            System.out.println("请输入修改后的套餐名称:");
            String tcmc = scanner.next();
            UpdateUtils.updateOrder(ddbh,xtcbh,tcbh,tcmc);
            System.out.println("更新订单信息成功！");
            manage();
        }
        if (i==4){
            System.out.println("请输入要查询的订单编号:");
            String ddbh = scanner.next();
            SelectUtils.selectOrder(ddbh);
            manage();
        }
        if (i==5){
            VedioSy.appManage();
        }
    }
}
