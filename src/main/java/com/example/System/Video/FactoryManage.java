package com.example.System.Video;

import java.util.Scanner;

public class FactoryManage {

    public static void manage(){
        System.out.println("====     1-添加厂家     ====");
        System.out.println("====     2-更新厂家     ====");
        System.out.println("====     3-查询厂家     ====");
        System.out.println("====       4-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入厂家编号:");
            String cjbh = scanner.next();
            System.out.println("请输入厂家名称:");
            String cjmc = scanner.next();
            System.out.println("请输入厂家地址:");
            String cjdz = scanner.next();
            System.out.println("请输入厂家联系电话:");
            String lxdh = scanner.next();
            InsertUtils.insertFactory(cjbh,cjmc,cjdz,lxdh);
            System.out.println("添加厂家信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入要修改的厂家编号:");
            String xcjbh = scanner.next();
            System.out.println("请输入修改后的厂家编号:");
            String cjbh = scanner.next();
            System.out.println("请输入修改后的厂家名称:");
            String cjmc = scanner.next();
            UpdateUtils.updateFactory(xcjbh,cjbh,cjmc);
            System.out.println("更新厂家信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要查询的厂家编号:");
            String cjbh = scanner.next();
            SelectUtils.selectFactory(cjbh);
            manage();
        }
        if (i==4){
            VedioSy.appManage();
        }
    }
}
