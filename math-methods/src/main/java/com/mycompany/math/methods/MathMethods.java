package com.mycompany.math.methods;

import java.util.Scanner;

public class MathMethods {

    public static void main(String[] args) {
        Scanner iK = new Scanner(System.in);
        double x, y, z = -5.00, A, B, C;
        
        
        System.out.println("Digite 2 numeros: ");
        x = iK.nextDouble();
        y = iK.nextDouble();
                
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        System.out.printf("Raiz quadrada de: %.1f é %.1f", x, A);
        System.out.printf("Raiz quadrada de: %.1f é %.1f", y, B);
        System.out.printf("\nRaiz quadrada de: %.15f é %.1f", z, C);
        
        A = Math.pow(x, 2);
        B = Math.pow(y, 3);
        C = Math.pow(z, 4);
        System.out.printf("\n%.1f elevado ao quadrado é: %.1f", x,A);
        System.out.printf("\n%.1f elevado ao cubo é: %.1f", y,B);
        System.out.printf("\n%.1f elevado a quarta é: %.1f", z,C);
        
        A = Math.abs(x);
        B = Math.abs(y);
        C = Math.abs(z);
        System.out.printf("\nvalor absoluto de %.1f = %.1f",x, A);
        System.out.printf("\nvalor absoluto de %.1f = %.1f",y, B);
        System.out.printf("\nvalor absoluto de %.1f = %.1f",z, C);
        
    }
}
