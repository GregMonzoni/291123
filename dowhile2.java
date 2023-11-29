package aula10;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        // List<String> usuariosLogados = new ArrayList<>();
        // String [] UsuariosLogados = {"teste1","teste2","..."};
        // UsuariosLogados[3] = "teste4"; //crio uma nova matriz
        // UsuariosLogados[2] = "Substituir a string ..."; //substituo a matriz 2

        List<String> usersLogged = new ArrayList<>();
        int limitUsers = 2;
        Scanner scUser = new Scanner(System.in);
        String usuario;
        try {
            while (usersLogged.size() < limitUsers) {
                System.out.println("digite o usuario: ");
                usuario = scUser.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);
                } else {
                    System.out.println("digite um usuario valido");
                }
                Thread.sleep(1000);
            }
            System.out.println("limite de usuarios excedido");
        } catch (InterruptedException e) {
            System.out.println("ops! houve algum erro..." + e);
        }
        scUser.close();
        
    }
}
