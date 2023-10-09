package com.exercicios.S01;
/*
 * Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora.
 * O programa deve pedir um número, depois outro, e por último uma operação.
 * O sistema deve aceitar como operação qualquer uma dessas 4 opções: “somar”, “subtrair”, “multiplicar” 
 * ou "dividir", e realizar a operação correspondente entre os 2 números inseridos,
 * para então escrever na tela do usuário o resultado.
 */

import java.util.Scanner;

public class ExercicioS01Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculadora 1.0 ===");

        System.out.println("Informe o primeiro número:");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo número:");
        double num2 = sc.nextDouble();

        sc.nextLine();
        
        System.out.println("Informe uma operação (Soma +, Subtração -, Divisão /, Multiplicação *):");
        String operacao = sc.nextLine();

        double resultado = 0;

        switch(operacao) {
            case "+":
            resultado = num1 + num2;
            break;
            case "-":
            resultado = num1 - num2;
            break;
            case "*":
            resultado = num1 * num2;
            break;
            case "/":
            resultado = num1 / num2;
            break;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
