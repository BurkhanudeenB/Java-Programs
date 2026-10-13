package com.example.userregistrationapi.controller;

import java.io.*;
// Step 1: Implement Serializable
class Student implements Serializable
{
    int id; String name;
    Student(int id, String name)
    {
        this.id = id; this.name = name;
    }
}
public class Serialization
{
    public static void main(String[] args)
    {
        try
        {
            // Create object
            Student s1 = new Student(101, "Arun");
            // Step 2: Serialize object
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object Serialized Successfully!");
            // Step 3: Deserialize object
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object Deserialized Successfully!");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
