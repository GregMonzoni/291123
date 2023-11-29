package aula10;

import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {
        int vAlturaMax = 100;
        Scanner scAltura = new Scanner(System.in);
        System.out.println("digite a altura do pacote");
        int altura = scAltura.nextInt();

        if (altura > vAlturaMax) {
            System.out.println("altura inválida");
        } else {
            System.out.println("altura válida");
        }
        scAltura.close();
    }
}
