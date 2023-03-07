
package com.mycompany.ex06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quadrant = 0;
        
        System.out.printf("Type the cordinate X: ");
        double cordinateX = scan.nextDouble();
        
        System.out.printf("Type the cordinate Y: ");
        double cordinateY = scan.nextDouble();
        
        while(cordinateX != 0 && cordinateY != 0) { //Cordinate choice loop
            
            if (cordinateX > 0 ) { //X > 0
               if(cordinateY > 0) { //Axels x & y > 0 --> 1º quadrant.
                   quadrant = 1;
                } else if (cordinateY < 0) { //Axel x>0 & Axel y<0 --> 4ºquadrant.
                   quadrant = 4;
                }
            } else {//X < 0
                if(cordinateY > 0) { //Axel x<0 & Axel y>0 --> 2ºquadrant.
                    quadrant = 2;
                } else if (cordinateY < 0) { //Axel x&y < 0 --> 3ºquadrant.
                    quadrant = 3;
                }
            }
            
            System.out.printf("X:%.2f Y:%.2f -> %dºquadrant.", cordinateX, cordinateY, quadrant);
            
            System.out.printf("\nType the cordinate X: ");
            cordinateX = scan.nextDouble();
            
            System.out.printf("Type the cordinate Y: ");
            cordinateY = scan.nextDouble();
        }
        
        scan.close();
    }
}
