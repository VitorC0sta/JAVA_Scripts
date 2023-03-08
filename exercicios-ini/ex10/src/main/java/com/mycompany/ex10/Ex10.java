
package com.mycompany.ex10;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cases;
        float[] numbers = new float[3];
        float[] avarageArray = new float[3];
        
        System.out.printf("Type how much cases will have: ");
        cases = scan.nextInt();
        
        for(int i = 0; i < cases ; i++) {
            System.out.printf("\ncase %d --\n", i+1);
            for (int j=0 ;j < numbers.length ; j++) {
                System.out.printf("Type a number: ");
                numbers[j] = scan.nextFloat();
                
            }
            
            float avarage = (numbers[0]*2 + numbers[1]*3 + numbers[2]*5)/10;
            avarageArray[i] = avarage;
            
        }
        for (int i = 0; i < avarageArray.length; i++) {
            
            System.out.printf("%.1f\n", avarageArray[i]);
            
        }
        scan.close();
        
    }
}
