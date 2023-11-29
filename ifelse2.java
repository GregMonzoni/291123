package aula10;

import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner scNum1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scNum1.nextInt();
        if (num1 <= 0) {
            System.out.println("Digite um numero maior que zero");
            System.exit(0);
        }

        Scanner scNum2 = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        int num2 = scNum1.nextInt();

        if (num2 <= 0) {
            System.out.println("Digite um numero maior que zero");
            System.exit(0);
        } 
        System.out.println("A soma dos numeros digitados é: " +(num1 + num2));
        scNum1.close();
        scNum2.close();
        
    }
}
