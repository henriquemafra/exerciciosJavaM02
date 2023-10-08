package com.exercicios;

import java.util.Scanner;

/*
 Crie um programa em Java que, utilizando a classe Scanner, 
 pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela,
 em uma única “string”, o nome completo do usuário. 
 Informe também ao usuário quantas letras tem no nome dele.
 */

public class ExercicioS01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===  Imprime nome 1.0 ===");
        System.out.println();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;
        int quantidadeLetras = nomeCompleto.length() - 1;

        System.out.println("Seu nome é " + nomeCompleto + " e seu nome completo tem " +
         quantidadeLetras + " letras.");

         scanner.close();

    }
}
