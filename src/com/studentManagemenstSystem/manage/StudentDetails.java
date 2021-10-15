package com.studentManagemenstSystem.manage;

public class StudentDetails {
    private int grNumber;
    private int enrollmentNumber;
    private String name;
    private String branch;
    private int semester;
    private String email;
    private String phoneNumber;
    private String address;

    public StudentDetails(int grNumber, int enrollmentNumber, String name, String branch, int semester, String email, String phoneNumber, String address) {
        this.grNumber = grNumber;
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.branch = branch;
        this.semester = semester;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getGrNumber() {
        return grNumber;
    }

    public void setGrNumber(int grNumber) {
        this.grNumber = grNumber;
    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
