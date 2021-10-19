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
        String name = sc.next();

        System.out.print("\t\t\tEnter Student Branch : ");
        String branch = sc.next();

        System.out.print("\t\t\tEnter Student Semester : ");
        int semester = sc.nextInt();

        System.out.print("\t\t\tEnter Student Email : ");
        String email = sc.next();

        System.out.print("\t\t\tEnter Student Phone Number : ");
        String phone = sc.next();

        System.out.print("\t\t\tEnter Student Address : ");
        String address = sc.next();

        StudentDetails st = new StudentDetails(grNumber,enrollmentNumber,name,branch,semester,email,phone,address);
        boolean flag = StudentDao.addStudent(st);

        if (flag){
            System.out.println("\n\tStudent record added successfully...\n");
        }else{
            System.out.println("\n\tSomething went wrong, try again...\n");
        }

        Main.separaterLine();
        CrudMenu.taskList();
    }
    public static void update(){
        System.out.println("Update");
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
            System.out.println("\n\tSomething went wrong, try again...\n");
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
