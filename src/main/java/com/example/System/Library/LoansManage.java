package com.example.System.Library;

import java.util.Scanner;

public class LoansManage {

    public static void manage(){
        System.out.println("====     1-添加借阅     ====");
        System.out.println("====     2-更新借阅     ====");
        System.out.println("====     3-查询借阅     ====");
        System.out.println("====     4-删除借阅     ====");
        System.out.println("====       5-退出      ====");

        System.out.println("==== 请输出对应功能编号 ====");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        if (i==1){
            System.out.println("请输入LoanID:");
            String LoanID = scanner.next();
            System.out.println("请输入BookID:");
            String BookID = scanner.next();
            System.out.println("请输入ReaderID:");
            String ReaderID = scanner.next();
            System.out.println("请输入LoanDate:");
            String LoanDate = scanner.next();
            System.out.println("请输入ReturnDate:");
            String ReturnDate = scanner.next();
            InsertUtils.insertLoan(LoanID,BookID,ReaderID,LoanDate,ReturnDate);
            System.out.println("添加借阅信息成功！");
            manage();
        }
        if (i==2){
            System.out.println("请输入要修改的LoanID:");
            String LoanID = scanner.next();
            System.out.println("请输入修改后的BookID:");
            String BookID = scanner.next();
            System.out.println("请输入修改后的ReaderID:");
            String ReaderID = scanner.next();
            System.out.println("请输入修改后的LoanDate:");
            String LoanDate = scanner.next();
            System.out.println("请输入修改后的ReturnDate:");
            String ReturnDate = scanner.next();
            UpdateUtils.updateLoan(LoanID,BookID,ReaderID,LoanDate,ReturnDate);
            System.out.println("更新借阅信息成功！");
            manage();
        }
        if (i==3){
            System.out.println("请输入要查询的LoanID:");
            String LoanID = scanner.next();
            SelectUtils.selectLoan(LoanID);
            manage();
        }
        if (i==4){
            System.out.println("请输入删除LoanID:");
            String LoanID = scanner.next();
            DeleteUtils.deleteLoan(LoanID);
            System.out.println("删除借阅信息成功！");
            manage();
        }
        if (i==4){
            BookSy.appManage();
        }
    }
}
