package com.mycompany.ex02;

import java.util.Scanner;
import java.lang.Math;


public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        double radio, circleArea;
        
        System.out.println("Write your radio size: ");
        radio = scan.nextDouble();
        
        circleArea = Math.PI * (Math.pow(radio,2));
        
        System.out.printf("\n The area size is: %.4f", circleArea);
        
        scan.close();
    }
}
