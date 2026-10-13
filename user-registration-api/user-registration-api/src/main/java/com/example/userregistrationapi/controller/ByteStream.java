package com.example.userregistrationapi.controller;

import java.io.*;
public class ByteStream
{
    public static void main(String[] args)
    {
        try
        {  // "C:\\Users\\acer\\OneDrive\\Desktop\\Stackly\\Programs\\user-registration-api\\user-registration-api\\src\\main\\java\\com\\example\\userregistrationapi\\controller\\input.jpg
            FileInputStream fis = new FileInputStream("input.jpg");
            FileOutputStream fos = new FileOutputStream("output.jpg");
            int data;
            while ((data = fis.read()) != -1)
            {
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}