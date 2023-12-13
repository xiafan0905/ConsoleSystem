package com.example.System.Library;

import java.util.Scanner;

public class UserManage {

    public static void manage(){
        System.out.println("====     1-添加作者     ====");
        System.out.println("====     2-删除作者     ====");
        System.out.println("====     3-更新作者     ====");
        System.out.println("====     4-查询作者     ====");
        System.out.println("====       5-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入AuthorID:");
            String authorID = scanner.next();
            System.out.println("请输入AuthorName:");
            String authorName = scanner.next();
            InsertUtils.insertAuthor(authorID,authorName);
            System.out.println("添加作者信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入删除AuthorID:");
            String authorID = scanner.next();
            DeleteUtils.deleteAuthor(authorID);
            System.out.println("删除作者信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入更新AuthorID:");
            String xzz = scanner.next();
            System.out.println("请输入修改后的AuthorID:");
            String zz = scanner.next();
            System.out.println("请输入修改后的AuthorName:");
            String zzname = scanner.next();
            UpdateUtils.updateAuthor(xzz,zz,zzname);
            System.out.println("更新作者信息成功！");
            manage();
        }
        if (i==4){
            System.out.println("请输入要查询的AuthorID:");
            String AuthorID = scanner.next();
            SelectUtils.selectAuthor(AuthorID);
            manage();
        }
        if (i==5){
            BookSy.appManage();
        }
    }
}
