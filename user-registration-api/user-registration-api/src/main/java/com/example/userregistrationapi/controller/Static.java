package com.example.userregistrationapi.controller;

public class Static {
    static String collegeName = "Global University";
    static int studentCount = 0;
    String studentName;
    int rollNo;

    public Static(String name)
    {
        this.studentName = name;
        studentCount++;
        this.rollNo = studentCount;
    }
    static void changeCollege(String newName)
    {
        collegeName = newName;
    }
    void displayInfo()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + studentName);
        System.out.println("College Name :" + collegeName);
        System.out.println();
    }
    public static void main(String[] args)
    {
        System.out.println("Initial College Name : " +Static.collegeName);
        System.out.println();
        Static s1 = new Static("Alice");
        Static s2 = new Static("Bob");

        s1.displayInfo();
        s2.displayInfo();

        Static.changeCollege("Tech Institute");
        System.out.println("\n ```````` After College Name Update ````````");
        s1.displayInfo();
        s2.displayInfo();

        System.out.println("Total Student created : " + Static.studentCount);

    }
}
