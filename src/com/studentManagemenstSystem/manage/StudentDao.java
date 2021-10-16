package com.studentManagemenstSystem.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean addStudent(StudentDetails st){
        boolean flag = false;
        try{
            // jdbc connection...
            Connection connection = ConnectionProvider.createConnection();

            // Query
            String query = "insert into students(gr_number,enrollment_number,name,branch,semester,email,phone_number,address) values(?,?,?,?,?,?,?,?)";

            // Prepared Statement
            PreparedStatement pstmt = connection.prepareStatement(query);

            // set the value of parameters
            pstmt.setInt(1, st.getGrNumber());
            pstmt.setInt(2, st.getEnrollmentNumber());
            pstmt.setString(3, st.getName());
            pstmt.setString(4, st.getBranch());
            pstmt.setInt(5, st.getSemester());
            pstmt.setString(6, st.getEmail());
            pstmt.setString(7, st.getPhoneNumber());
            pstmt.setString(8, st.getAddress());

            // execute...
            pstmt.executeUpdate();
            flag=true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public static void displayRecords(){
        try{
            // jdbc connection...
            Connection connection = ConnectionProvider.createConnection();

            // Query
            String query = "select * from students";

            // Prepared Statement
            Statement stmt = connection.createStatement();

            // execute...
            ResultSet rset = stmt.executeQuery(query);

            while (rset.next()){
                 int grNumber = rset.getInt(1);
                 int enrollmentNumber = rset.getInt(2);
                 String name = rset.getString(3);
                 String branch = rset.getString(4);
                 int semester = rset.getInt(5);
                 String email = rset.getString(6);
                 String phoneNumber = rset.getString(7);
                 String address = rset.getString(8);

                System.out.println("------------------------------------------------------------");
                System.out.println("Gr Number : " + grNumber);
                System.out.println("Enrollment Number : " + enrollmentNumber);
                System.out.println("Name : " + name);
                System.out.println("Branch : " + branch);
                System.out.println("Semester : " + semester);
                System.out.println("E-mail : " + email);
                System.out.println("Phone Number : " + phoneNumber);
                System.out.println("Address : " + address);
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
