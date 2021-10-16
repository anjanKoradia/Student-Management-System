package com.studentManagemenstSystem.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
