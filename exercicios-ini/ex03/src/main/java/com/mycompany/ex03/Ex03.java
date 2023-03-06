package com.mycompany.ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,d, result;
        System.out.println("Choose 4 values to calculate");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();
        result = (a*b - c*d);
        
        System.out.printf("result: %.0f", result);
        
        scan.close();
    }
}
