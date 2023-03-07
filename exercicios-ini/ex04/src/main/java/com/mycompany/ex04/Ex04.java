package com.mycompany.ex04;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {

       Scanner inputScan = new Scanner(System.in);
       double minutes, finalTax;
       
       System.out.println("Type the total minutes called");
       minutes = inputScan.nextDouble();
       
       
       
       finalTax = (minutes > 100) ? 50.00+2*(minutes-100) : 50.00;
       
       System.out.printf("Total bill: $%.2f.", finalTax);
    }
}
