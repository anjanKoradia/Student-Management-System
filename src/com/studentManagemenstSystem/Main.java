package com.studentManagemenstSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean authStatus = UserAuth.login();

        if(authStatus){
            System.out.println("\n\n\t\tWELCOME TO STUDENT MANAGEMENT APP");
        }else{
           System.out.println("\nInvalid Password!!");
           System.out.println("\nThank you for using my application...");
           System.out.println("See You Soon .... Bye Bye\n");
       }
    }
}
