package com.mycompany.input_project;

import java.util.Scanner;

public class Input_project {

    public static void main(String[] args) {

        Scanner inputKeyboard  = new Scanner(System.in);
        String x;
        x = inputKeyboard.next();
        
        System.out.printf("Voce digitou: %s.", x);
        
        int y = inputKeyboard.nextInt();
        System.out.printf("\nVoce digitou: %d.", y);
        
        double z = inputKeyboard.nextDouble();
        System.out.printf("\nVoce digitou: %.3f", z);
        
        inputKeyboard.close();
    }
}
