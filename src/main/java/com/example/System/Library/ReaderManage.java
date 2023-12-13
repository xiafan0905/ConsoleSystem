package com.example.System.Library;

import java.util.Scanner;

public class ReaderManage {

    public static void manage(){
        System.out.println("====     1-添加读者     ====");
        System.out.println("====     2-更新读者     ====");
        System.out.println("====     3-查询读者     ====");
        System.out.println("====       4-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入ReaderID:");
            String ReaderID = scanner.next();
            System.out.println("请输入ReaderName:");
            String ReaderName = scanner.next();
            System.out.println("请输入Email:");
            String Email = scanner.next();
            System.out.println("请输入Phone:");
            String Phone = scanner.next();
            InsertUtils.insertReader(ReaderID,ReaderName,Email,Phone);
            System.out.println("添加读者信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入要修改的ReaderID:");
            String xReaderID = scanner.next();
            System.out.println("请输入修改后的ReaderID:");
            String ReaderID = scanner.next();
            System.out.println("请输入修改后的ReaderName:");
            String ReaderName = scanner.next();
            UpdateUtils.updateReader(xReaderID,ReaderID,ReaderName);
            System.out.println("更新读者信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要查询的ReaderID:");
            String ReaderID = scanner.next();
            SelectUtils.selectReader(ReaderID);
            manage();
        }
        if (i==4){
            BookSy.appManage();
        }
    }
}
