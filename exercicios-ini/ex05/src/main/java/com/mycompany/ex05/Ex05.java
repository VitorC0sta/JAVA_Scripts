
package com.mycompany.ex05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Type your password: ");
        int pwd = scan.nextInt();
        
        while(pwd != 2002) {
            System.out.printf("Invalid password!\nPlease retype: ");
            pwd = scan.nextInt();
        }
        
        System.out.printf("Access released");
        scan.close();
    }
}
