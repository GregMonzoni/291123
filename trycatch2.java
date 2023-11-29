package aula10;

import java.util.Scanner;

public class trycatch2 {
    public static void main(String[] args) {
        try {
            Scanner scAltura = new Scanner(System.in);
            System.out.println("Digite a altura");
            double altura = scAltura.nextDouble();

            Scanner scLargura = new Scanner(System.in);
            System.out.println("Digite a largura");
            double largura = scLargura.nextDouble();

            System.out.println("O metro quadrado é de " + (largura * altura));

            scAltura.close();
            scLargura.close();
    } catch (Exception e) {
        System.out.println("ops! ocorreu o erro " + e);
    }
}
}