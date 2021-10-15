package com.studentManagemenstSystem.crudOperations;

import java.util.Scanner;

public class CrudMenu {
    public static void taskList(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\t1. Add new student record");
        System.out.println("\t\t\t2. Update existing student details");
        System.out.println("\t\t\t3. Delete student record");
        System.out.println("\t\t\t4. Display students records");
        System.out.println("\t\t\t0. Exit App..\n");

        System.out.print("\t\tEnter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // add new student record
                CrudOperations.add();
                break;
            case 2:
                // update student details;
                CrudOperations.update();
                break;
            case 3:
                // delete student record;
                CrudOperations.delete();
                break;
            case 4:
                // display students records;
                CrudOperations.display();
                break;
            case 0:
                // exit app;
                System.out.println("\nThank you for using my application...");
                System.out.println("See You Soon .... Bye Bye\n");
                System.exit(0);
                break;
        }
    }
}
