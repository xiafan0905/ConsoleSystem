package com.example.System.Video;

import java.util.Scanner;

public class MemberManage {

    public static void manage(){
        System.out.println("====     1-添加会员     ====");
        System.out.println("====     2-删除会员     ====");
        System.out.println("====     3-更新会员     ====");
        System.out.println("====     4-查询会员     ====");
        System.out.println("====       5-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入姓名:");
            String name = scanner.next();
            System.out.println("请输入身份证号:");
            String sfzh = scanner.next();
            System.out.println("请输入生日:");
            String sr = scanner.next();
            System.out.println("请输入性别:");
            String xb = scanner.next();
            System.out.println("请输入联系电话:");
            String lxdh = scanner.next();
            System.out.println("请输入家庭住址:");
            String jtzz = scanner.next();
            InsertUtils.insertMember(name,sfzh,xb,sr,lxdh,jtzz);
            System.out.println("添加会员信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入删除身份证号:");
            String sfzh = scanner.next();
            DeleteUtils.deleteMember(sfzh);
            System.out.println("删除会员信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要修改的身份证号:");
            String xsfzh = scanner.next();
            System.out.println("请输入修改后的身份证号:");
            String sfzh = scanner.next();
            System.out.println("请输入修改后的会员姓名:");
            String name = scanner.next();
            System.out.println("请输入修改后的联系电话:");
            String lxdh = scanner.next();
            UpdateUtils.updateMember(xsfzh,sfzh,name,lxdh);
            System.out.println("更新会员信息成功！");
            manage();
        }
        if (i==4){
            System.out.println("请输入要查询的身份证号:");
            String sfzh = scanner.next();
            SelectUtils.selectMember(sfzh);
            manage();
        }
        if (i==5){
            VedioSy.appManage();
        }
    }
}
