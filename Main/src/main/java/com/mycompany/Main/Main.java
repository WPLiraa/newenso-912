package com.mycompany.main;

import java.util.Scanner;

public class Main {
    static double result;
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = input.nextDouble();
        
        System.out.println("Escolha uma das opcoes: ");
        System.out.println("Para SOMA, digite 1 ");
        System.out.println("Para SUBTRACAO, digite 2 ");
        System.out.println("Para SAIR, digite 0 \n");
        int num3 = input.nextInt();
        
        if(num3 != 0) {
        
        switch (num3) {

        case 1:
            result = num1 + num2;
            break;
            
        case 2:
            result = num1 - num2;
            break;
            
    }
    
    System.out.println("Resultado igual a: "+ result);
}
    else
    {
        System.out.println("Voce optou por sair!");
    }

    }

        
}
