package com.example.userregistrationapi.controller;

public class MathFunctions {
    public static void main (String[] args) {
        double num = -10.6;
        double a = 25;
        double b = 10;

        System.out.println("1. Absolute : "+ Math.abs(num));
        System.out.println("2. Round : "+ Math.round(num));
        System.out.println("3. Ceil : "+ Math.ceil(num));
        System.out.println("4. Floor : "+ Math.floor(num));
        System.out.println("5. Random : "+ Math.random());
        System.out.println("6. Maximum : "+ Math.max(a,b));
        System.out.println("7. Minimum : "+ Math.min(a,b));
        System.out.println("8. SquareRoot : "+ Math.sqrt(a));
        System.out.println("9. Power : "+ Math.pow(2,3));
        System.out.println("10. CubeRoot :"+ Math.cbrt(27));
        System.out.println("11. Signum :"+ Math.signum(num));
        System.out.println("12. Exponential :"+ Math.exp(2));
        System.out.println("13. Log : "+ Math.log(10));
        System.out.println("14. Log10 : "+ Math.log10(100));
        System.out.println("15. Sin : "+ Math.sin(Math.toRadians(90)));



    }
}


