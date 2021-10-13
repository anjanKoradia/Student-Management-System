package com.studentManagemenstSystem;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserAuth {
    protected static String password = "anjan";

    public static boolean login(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        System.out.print("\n\nEnter the password to login : ");
        String enteredPass = sc.next();

        try{
            if (password.equals(enteredPass)){
                System.out.print("\nPassword Match!\n\tLOADING");
                for (int i = 1; i <= 3; i++)
                {
                    try{
                        TimeUnit.MILLISECONDS.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.print(".");
                }
                System.out.println("\n");
                return flag = true;
            }else{
                return flag;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
