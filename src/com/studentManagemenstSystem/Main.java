package com.studentManagemenstSystem;

import com.studentManagemenstSystem.crudOperations.CrudMenu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean authStatus = UserAuth.login();

        if(authStatus){
            separaterLine();
            System.out.println("\n\n\t\t###--- WELCOME TO STUDENT MANAGEMENT APP ---###");
            CrudMenu.taskList();
        }else{
            System.out.println("\nInvalid Password!!");
            System.out.println("\nThank you for using my application...");
            System.out.println("See You Soon .... Bye Bye\n");
       }
    }

    public static void separaterLine(){
        for (int i=1;i<=100;i++){
            System.out.print("-");
        }
    }
}
