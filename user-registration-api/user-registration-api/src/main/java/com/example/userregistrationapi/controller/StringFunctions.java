package com.example.userregistrationapi.controller;

public class StringFunctions {
    public static void main(String[] args) {
    String str = "Hello Java Programmers";
    String str2 = "Hello Java Programmers";
    String str3 = "   Hello Java   ";


    System.out.println("1. Length: " + str.length());
    System.out.println("2. Character at index 6: " + str.charAt(6));
    System.out.println("3. Uppercase: " + str.toUpperCase());
    System.out.println("4. Lowercase: " + str.toLowerCase());
    System.out.println("5. Equals: " + str.equals(str2));
    System.out.println("6. Equals Ignore Case: " + str.equalsIgnoreCase(str2));
    System.out.println("7. Contains 'Java': " + str.contains("Java"));
    System.out.println("8. Starts With 'Hello': " + str.startsWith("Hello"));
    System.out.println("9. Ends With 'World': " + str.endsWith("World"));
    System.out.println("10. Index of 'Java': " + str.indexOf("Java"));
    System.out.println("11. Last Index of 'o': " + str.lastIndexOf("o"));
    System.out.println("12. Substring: " + str.substring(6, 10));
    System.out.println("13. Replace: " + str.replace("Java", "Python"));
    System.out.println("14. Trim: '" + str3.trim() + "'");
    System.out.println("15. Concat: " + str.concat(" Programming"));

    }
}