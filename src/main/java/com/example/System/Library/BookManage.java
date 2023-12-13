package com.example.System.Library;

import java.util.Scanner;

public class BookManage {

    public static void manage(){
        System.out.println("====     1-添加书籍     ====");
        System.out.println("====     2-删除书籍     ====");
        System.out.println("====     3-更新书籍     ====");
        System.out.println("====     4-查询书籍     ====");
        System.out.println("====       5-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入书籍ID:");
            String sjid = scanner.next();
            System.out.println("请输入书名:");
            String sm = scanner.next();
            System.out.println("请输入作者id:");
            String zzid = scanner.next();
            System.out.println("请输入ibsn:");
            String ibsn = scanner.next();
            System.out.println("请输入发布日期:");
            String fbrq = scanner.next();
            InsertUtils.insertBook(sjid,sm,ibsn,fbrq,zzid);
            System.out.println("添加书籍信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入删除书籍ID:");
            String sjid = scanner.next();
            DeleteUtils.deleteBook(sjid);
            System.out.println("删除书籍信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要修改的书籍ID:");
            String xsjid = scanner.next();
            System.out.println("请输入修改后的书籍ID:");
            String sjid = scanner.next();
            System.out.println("请输入修改后的书名:");
            String sm = scanner.next();
            System.out.println("请输入修改后的ibsn:");
            String ibsn = scanner.next();
            System.out.println("请输入修改后的作者ID:");
            String zzid = scanner.next();
            System.out.println("请输入修改后的发布日期:");
            String fbrq = scanner.next();
            UpdateUtils.updateBook(xsjid,sjid,zzid,fbrq,sm,ibsn);
            System.out.println("更新书籍信息成功！");
            manage();
        }
        if (i==4){
            System.out.println("请输入要查询的书籍ID:");
            String sjid = scanner.next();
            SelectUtils.selectBook(sjid);
            manage();
        }
        if (i==5){
            BookSy.appManage();
        }
    }
}
