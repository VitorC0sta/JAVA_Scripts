
package com.mycompany.ex08;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose a number <= 1000 or >= 1.");
        int numberCount;
        do{
            
            System.out.printf("Type a number: ");
            numberCount = scan.nextInt();
            
        } while(numberCount > 1000 || numberCount < 1) ;
        
        for(int i = 0; i <= numberCount; i++) {
            if(i%2!=0) {
                System.out.printf("%d\n", i);          
            }
        }
        scan.close();
    }
}