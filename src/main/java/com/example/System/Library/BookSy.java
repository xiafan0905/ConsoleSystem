package com.example.System.Library;

import java.util.Scanner;

public class BookSy {

    public static void main(String[] args) {
        //主页面启动程序。
        appManage();
    }

    public static void appManage(){
        System.out.println("====    图书馆管理系统   ====");
        System.out.println("====     1-书籍管理     ====");
        System.out.println("====     2-作者管理     ====");
        System.out.println("====     3-读者管理     ====");
        System.out.println("====     4-类别管理     ====");
        System.out.println("====     5-借阅管理     ====");
        System.out.println("====     6-退出系统     ====");

        System.out.println("==== 请输出对应功能的编号 ====");
        Scanner scanner = new Scanner(System.in);

       int i = scanner.nextInt();
       if (i==1){
           //书籍管理
           BookManage.manage();
       }
        if (i==2){
           //作者管理
            UserManage.manage();
        }
        if (i==3){
            //读者管理
            ReaderManage.manage();
        }
        if (i==4){
            //类别管理
            CategoriesManage.manage();
        }
        if (i==5){
            //借阅管理
            LoansManage.manage();
        }
        if (i==6){
            //退出系统
            System.exit(0);
        }
    }
}
