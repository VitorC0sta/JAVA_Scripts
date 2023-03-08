package com.mycompany.ex09;

import java.util.Scanner;


public class Ex09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integerValue;
        int insideInterval = 0;
        int outsideInterval = 0;
        int numbers;
            
        System.out.printf("How much numbers: ");
        numbers = scan.nextInt();
        
        for (int i = 0; i < numbers; i++) {
            
            System.out.printf("Type a number: ");
            integerValue = scan.nextInt();
            
            if (integerValue <= 20) { //inside [10,20] interval count.
                
                if (integerValue >=10) {
                    insideInterval++;
                
                }else if( integerValue < 10) {
                    outsideInterval++;
                }
            
            } else { //if number typed isn't be in [10,20] will be count.
                outsideInterval++;
            
            }
            
        }
        
        System.out.printf("%d numbers inside interval.", insideInterval);
        System.out.printf("\n%d numbers outside interval.", outsideInterval);
        scan.close();   
    
    }

}
