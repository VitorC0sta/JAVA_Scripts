
package com.mycompany.ex07;

import java.util.Scanner; 

public class Ex07 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int fuelType;
        int[] fuelTypeData = {0,0,0};
        boolean flag;
        
        do{
            
            System.out.println("Type>> \n[1]Alchool.\t[2]Gasoline.\n[3]Diesel.\t[4]Done.\n");
            fuelType = scan.nextInt();
            
            if(fuelType > 4 ||fuelType < 1) {
                flag = false;
                while(!flag) {
                    
                    System.out.println("Please type a valid number: ");
                    fuelType = scan.nextInt();
                    if(fuelType <= 4 && fuelType >= 1){
                        flag = true;
                    }
                }
            }
            
            switch(fuelType) {
                case 1: fuelTypeData[0]++;
                    break;
                
                case 2: fuelTypeData[1]++;
                    break;
                    
                case 3: fuelTypeData[2]++;
                    break;
                   
                default:
                    break;
                    
            }
            
            
        } while (fuelType != 4);
        
        System.out.printf("Thank you!\nAlchool: %d.",fuelTypeData[0]);
        System.out.printf("\nGasoline: %d.\nDiesel: %d.",fuelTypeData[1], fuelTypeData[2]);
        scan.close();
    }
}
