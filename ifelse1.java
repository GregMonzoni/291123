package aula10;

import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        String vUser = "teste";
        String vPass = "teste";

        Scanner scUser = new Scanner(System.in);
        System.out.println("digite o nome de usuario: ");
        String user = scUser.nextLine();

        Scanner scPass = new Scanner(System.in);
        System.out.println("digite a senha do usuario: ");
        String pass = scPass.nextLine();

        if (user.equals(vUser)&& pass.equals(vPass)) {
            System.out.println("Bem vindo ao sistema");
        } else {
            System.out.println("Usuario ou senha incorretos");
        }
        
        scPass.close();
        scUser.close();
        }
}
