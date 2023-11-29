package aula10;
import java.util.*;
public class trycatch1 {
    public static void main(String[] args) {
        try {
            Scanner scnPeso = new Scanner(System.in);
            System.out.println("Digite seu peso em kilos");
            double peso = scnPeso.nextDouble();
            Scanner scnAltura = new Scanner(System.in);
            System.out.println("Digite sua altura em metros");
            double altura = scnAltura.nextDouble();
            System.out.println(
                "Seu IMC é de " +
                (peso / (altura * altura))
            );
            System.out.println(
                "(Peso / (Altura * Altura)) (" +
                peso +
                " / (" +
                altura +
                " * " +
                altura +
                ")) " +
                " [" + altura + " * " + altura + " = " + (altura * altura) + "] "
            );
            scnPeso.close();
            scnAltura.close();
        } catch (Exception e) {
            System.out.println("Não foi possível calcular seu IMC");
        }
    }

}