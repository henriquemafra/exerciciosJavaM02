package com.exercicios.S01;

import java.util.Scanner;

/*
 * Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir um número inteiro.
 * O programa deve verificar se o número é par ou ímpar, e exibir essa informação de volta ao usuário.
 */
public class ExercicioS01Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Verifica PAR/IMPAR 1.0 ===");
        System.out.println();
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
        sc.close();
    }
}
