package com.mycompany.loop01;

import java.util.Scanner;


public class Loop01 {
    public static void main(String[] args) {
        
        Scanner inputScan = new Scanner(System.in);
        
        int count = inputScan.nextInt();
        
        while (count != 0) {
            System.out.println("Type a number: ");
            count = inputScan.nextInt();
        }
        
        inputScan.close();
    }
}
