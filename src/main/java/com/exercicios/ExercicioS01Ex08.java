package com.exercicios;

import java.util.Scanner;

/*
 * Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora de P.A. e P.G.
 *  Peça para o usuário inserir um “valor inicial”, que deve ser um número inteiro. Em seguida,
 *  peça ao usuário para inserir um valor para a raiz. Depois, pergunte ao usuário se ele deseja 
 * calcular os 10 primeiros valores de uma P.A. ou de uma P.G. para os números inseridos anteriormente.
 *  Então, calcule os 10 primeiros valores de uma P.A. ou P.G. utilizando os números inseridos pelo usuário, 
 * e escreva essa sequência de valores na tela para o usuário visualizar o resultado.
 * Relembrando: P.A. (Progressão Aritmética) é uma sequência numérica em que cada termo,
 *  a partir do segundo, é igual à soma do termo anterior com a raiz. Exemplo: Valor inicial = 1;
 *  raiz = 3; P.A. = 1, 4, 7, 10, 13, 16, 19, 22, 25, 28.
P.G. (Progressão Geométrica) é como uma P.A., mas em vez de somar, multiplica-se a raiz.
 Exemplo: Valor inicial = 1; raiz = 3; P.G. = 1, 3, 9, 27, 81...

 */
public class ExercicioS01Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculadora de P.A. e P.G. ===");

        System.out.print("Informe o valor inicial: ");
        int valorInicial = sc.nextInt();

        System.out.print("Informe a raiz: ");
        int raiz = sc.nextInt();

        System.out.println("Deseja calcular os 10 primeiros valores de:");
        System.out.println("1. P.A.");
        System.out.println("2. P.G.");
        System.out.print("Escolha uma opção (1 ou 2): ");
        int escolha = sc.nextInt();

        System.out.println("Os 10 primeiros valores são:");

        switch (escolha) {
            case 1: // P.A.
                for (int i = 0; i < 10; i++) {
                    System.out.print(valorInicial + " ");
                    valorInicial += raiz;
                }
                break;
            case 2: // P.G.
                for (int i = 0; i < 10; i++) {
                    System.out.print(valorInicial + " ");
                    valorInicial *= raiz;
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
