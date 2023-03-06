package com.mycompany.ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        double a, b;
        System.out.println("Write 2 number to sum: ");
        a = inputData.nextDouble();
        b = inputData.nextDouble();
        
        System.out.printf("\nThe result is: %.1f", a + b);
        
        inputData.close();
    }
}
