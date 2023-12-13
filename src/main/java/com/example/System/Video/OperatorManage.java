package com.example.System.Video;

import java.util.Scanner;

public class OperatorManage {

    public static void manage(){
        System.out.println("====     1-添加运营商     ====");
        System.out.println("====     2-更新运营商     ====");
        System.out.println("====     3-查询运营商     ====");
        System.out.println("====       4-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入运营商编号:");
            String yysbh = scanner.next();
            System.out.println("请输入运营商名称:");
            String yysmc = scanner.next();
            System.out.println("请输入运营商地址:");
            String yysdz = scanner.next();
            System.out.println("请输入运营商联系电话:");
            String yyslxdh = scanner.next();
            InsertUtils.insertOperator(yysbh,yysmc,yysdz,yyslxdh);
            System.out.println("添加运营商信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入要修改的运营商编号:");
            String xyysbh = scanner.next();
            System.out.println("请输入修改后的运营商编号:");
            String yysbh = scanner.next();
            System.out.println("请输入修改后的运营商名称:");
            String yysmc = scanner.next();
            UpdateUtils.updateOperator(xyysbh,yysbh,yysmc);
            System.out.println("更新运营商信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要查询的运营商编号:");
            String yysbh = scanner.next();
            SelectUtils.selectOperator(yysbh);
            manage();
        }
        if (i==4){
            VedioSy.appManage();
        }
    }
}
