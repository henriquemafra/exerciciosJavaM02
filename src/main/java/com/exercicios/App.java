package com.exercicios;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int validacao = 0;
        Scanner scanner = new Scanner(System.in);

        while (validacao != 1) {

            System.out.println("***===== Quanto custa encher meu tanque - Versão 1.0 =====***");
                System.out.println();
            System.out.println("Digite a quantidade de litros:");
                double litros = scanner.nextDouble();
            System.out.println("Digite o preço do combustivel:");
                double preco = scanner.nextDouble();

                double precoFinal = litros * preco;

            System.out.println("Você quer saber quanto irá custar? Se sim, digite 1, se não digite 0.");

            validacao = scanner.nextInt();

            if (validacao != 1) {
                System.out.println("Beleza então.");
                    validacao = 0;
            } else {
                System.out.println("Encher seu tanque irá custar R$ " + precoFinal + ".");
            }
            
        }
        scanner.close();
    }
}
