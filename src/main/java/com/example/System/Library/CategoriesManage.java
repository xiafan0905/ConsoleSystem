package com.example.System.Library;

import java.util.Scanner;

public class CategoriesManage {

    public static void manage(){
        System.out.println("====     1-添加类别     ====");
        System.out.println("====     2-更新类别     ====");
        System.out.println("====     3-查询类别     ====");
        System.out.println("====       4-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入CategoryID:");
            String CategoryID = scanner.next();
            System.out.println("请输入CategoryName:");
            String CategoryName = scanner.next();
            InsertUtils.insertCategory(CategoryID,CategoryName);
            System.out.println("添加类别信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入要修改的CategoryID:");
            String xCategoryID = scanner.next();
            System.out.println("请输入修改后的CategoryID:");
            String CategoryID = scanner.next();
            System.out.println("请输入修改后的CategoryName:");
            String CategoryName = scanner.next();
            UpdateUtils.updateCategory(xCategoryID,CategoryID,CategoryName);
            System.out.println("更新类别信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要查询的CategoryID:");
            String CategoryID = scanner.next();
            SelectUtils.selectCategory(CategoryID);
            manage();
        }
        if (i==4){
            BookSy.appManage();
        }
    }
}
