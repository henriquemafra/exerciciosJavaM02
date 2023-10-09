package com.exercicios;

import java.util.Random;
import java.util.Scanner;

/*
 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário a seguinte 
 * frase: “Adivinhe qual número de 1 a 5 eu estou pensando”. Na sequência, o usuário deve
 *  inserir um número entre 1 e 5, e o seu programa deve gerar aleatoriamente outro número,
 *  também de 1 a 5. Se o número gerado for o mesmo que o usuário inseriu, o programa deve 
 * escrever na tela “Você acertou!”, mas se for diferente, o programa deve escrever “Você errou, 
 * o número correto era X”, onde X é o número gerado aleatoriamente pelo programa.
 */
public class ExercicioS01Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" === Advinha Número 1.0 ===");

        while (true) {
            System.out.println("Digite um numero entre 1 e 5:");
            int numero = sc.nextInt();

            Random random = new Random();
            int numeroSorte = random.nextInt(5) + 1;

            if (numeroSorte == numero) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.println(
                        "“Você errou, você digitou " + numero + " e o número correto era " + numeroSorte + ".");
            }
        }
        sc.close();
    }
}
