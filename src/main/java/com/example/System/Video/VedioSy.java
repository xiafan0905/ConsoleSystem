package com.example.System.Video;

import java.util.Scanner;

public class VedioSy {

    public static void main(String[] args) {
        //主页面启动程序。
        appManage();
    }

    public static void appManage(){
        System.out.println("==== 视频软件会员管理系统 ====");
        System.out.println("====     1-会员管理     ====");
        System.out.println("====     2-订单管理     ====");
        System.out.println("====     3-套餐管理     ====");
        System.out.println("====     4-厂家管理     ====");
        System.out.println("====    5-运营商管理     ====");
        System.out.println("====     6-退出系统     ====");

        System.out.println("==== 请输出对应功能的编号 ====");
        Scanner scanner = new Scanner(System.in);

       int i = scanner.nextInt();
       if (i==1){
           //会员管理
           MemberManage.manage();
       }
        if (i==2){
           //订单管理
            OrderManage.manage();
        }
        if (i==3){
            //套餐管理
            PackageManage.manage();
        }
        if (i==4){
            //厂家管理
            FactoryManage.manage();
        }
        if (i==5){
            //运营商管理
            OperatorManage.manage();
        }
        if (i==6){
            //退出系统
            System.exit(0);
        }
    }
}
