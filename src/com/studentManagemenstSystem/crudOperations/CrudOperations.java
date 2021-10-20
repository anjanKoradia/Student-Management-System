package com.studentManagemenstSystem.crudOperations;

import com.studentManagemenstSystem.Main;
import com.studentManagemenstSystem.manage.StudentDao;
import com.studentManagemenstSystem.manage.StudentDetails;

import java.util.Scanner;

public class CrudOperations {
    static Scanner sc = new Scanner(System.in);

    public static void add(){
        System.out.print("\n\t\t\tEnter Student GR Number : ");
        int grNumber = sc.nextInt();

        System.out.print("\t\t\tEnter Student Enrollment Number : ");
        int enrollmentNumber = sc.nextInt();

        System.out.print("\t\t\tEnter Student Name : ");
        String name = sc.nextLine();

        System.out.print("\t\t\tEnter Student Branch : ");
        String branch = sc.nextLine();

        System.out.print("\t\t\tEnter Student Semester : ");
        int semester = sc.nextInt();

        System.out.print("\t\t\tEnter Student Email : ");
        String email = sc.next();

        System.out.print("\t\t\tEnter Student Phone Number : ");
        String phone = sc.next();

        System.out.print("\t\t\tEnter Student Address : ");
        String address = sc.nextLine();

        StudentDetails st = new StudentDetails(grNumber,enrollmentNumber,name,branch,semester,email,phone,address);
        boolean flag = StudentDao.addStudent(st);

        if (flag){
            System.out.println("\n\tStudent record added successfully...\n");
        }else{
            System.out.println("\n\tSomething went wrong, please try again...\n");
        }

        Main.separaterLine();
        CrudMenu.taskList();
    }
    public static void update(){
        System.out.print("\n\t\t\tEnter Student Enrollment Number : ");
        int enrollmentNumber = sc.nextInt();

        System.out.println("\n\t\t\tSelect which details you want to change : ");
        System.out.println("\t\t\t\t1. Name");
        System.out.println("\t\t\t\t2. Branch");
        System.out.println("\t\t\t\t3. Semester");
        System.out.println("\t\t\t\t4. Email");
        System.out.println("\t\t\t\t5. Phone Number");
        System.out.println("\t\t\t\t6. Address\n");

        System.out.print("\t\t\tEnter your choice : ");
        int choice = sc.nextInt();

        boolean flag = StudentDao.updateDetail(enrollmentNumber,choice);
        switch (choice){
            case 1:
                if(flag){
                    System.out.println("\n\tStudent name changed successfully...\n");
                }else{
                    System.out.println("\n\tSomething went wrong, please try again...\n");
                }
                break;
            case 2:
                if(flag){
                    System.out.println("\n\tStudent branch changed successfully...\n");
                }else{
                    System.out.println("\n\tSomething went wrong, please try again...\n");
                }
                break;
            case 3:
                if(flag){
                    System.out.println("\n\tStudent semester changed successfully...\n");
                }else{
                    System.out.println("\n\tSomething went wrong, please try again...\n");
                }
                break;
            case 4:
                if(flag){
                    System.out.println("\n\tStudent email changed successfully...\n");
                }else{
                    System.out.println("\n\tSomething went wrong, please try again...\n");
                }
                break;
            case 5:
                if(flag){
                    System.out.println("\n\tStudent phone number changed successfully...\n");
                }else{
                    System.out.println("\n\tSomething went wrong, please try again...\n");
                }
                break;
            case 6:
                if(flag){
                    System.out.println("\n\tStudent address changed successfully...\n");
                }else{
                    System.out.println("\n\tSomething went wrong, please try again...\n");
                }
                break;
            default:
                System.out.println("\n\tInvalid Choice, please try again...\n");
                break;
        }

        Main.separaterLine();
        CrudMenu.taskList();
    }
    public static void delete(){
        System.out.print("\n\t\t\tEnter student grNumber to delete record : ");
        int grNumber = sc.nextInt();

        boolean flag = StudentDao.deleteStudentRecord(grNumber);

        if (flag){
            System.out.println("\n\tStudent record deleted successfully...\n");
        }else{
            System.out.println("\n\tSomething went wrong, please try again...\n");
        }

        Main.separaterLine();
        CrudMenu.taskList();
    }
    public static void display(){
        StudentDao.displayRecords();
        Main.separaterLine();
        CrudMenu.taskList();
    }
}
