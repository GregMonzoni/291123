package aula10;

import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idd = sc.nextInt();

        if (idd < 18) {
            System.out.println( "Voce é menor de idade");
        } else {
            System.out.println("Voce é maior de idade");
        }
        sc.close();
    }
}
