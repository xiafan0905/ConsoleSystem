package com.example.System.Video;

import java.util.Scanner;

public class PackageManage {

    public static void manage(){
        System.out.println("====     1-添加套餐     ====");
        System.out.println("====     2-更新套餐     ====");
        System.out.println("====     3-查询套餐     ====");
        System.out.println("====       4-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入套餐编号:");
            String tcbh = scanner.next();
            System.out.println("请输入套餐名称:");
            String tcmc = scanner.next();
            System.out.println("请输入厂家编号:");
            String cjbh = scanner.next();
            System.out.println("请输入厂家名称:");
            String cjmc = scanner.next();
            System.out.println("请输入购买日期:");
            String gmrq = scanner.next();
            System.out.println("请输入失效日期:");
            String sxrq = scanner.next();
            InsertUtils.insertPackage(tcbh,tcmc,cjbh,cjmc,gmrq,sxrq);
            System.out.println("添加套餐信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入要修改的套餐编号:");
            String xtcbh = scanner.next();
            System.out.println("请输入修改后的套餐编号:");
            String tcbh = scanner.next();
            System.out.println("请输入修改后的套餐名称:");
            String tcmc = scanner.next();
            UpdateUtils.updatePackage(xtcbh,tcbh,tcmc);
            System.out.println("更新套餐信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要查询的套餐编号:");
            String tcbh = scanner.next();
            SelectUtils.selectPackage(tcbh);
            manage();
        }
        if (i==4){
            VedioSy.appManage();
        }
    }
}
