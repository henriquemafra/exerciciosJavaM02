package com.exercicios;
/*
 * Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário
 * que digite sua altura (2 ou mais casas depois da vírgula), depois peça que o usuário digite seu peso, 
 * e então calcule o IMC e exiba essa informação ao usuário. 
 * Fórmula IMC = peso / (altura x altura).
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioS01Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calcula IMC 1.0 ===");
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#.##");
        String imcFormatada = df.format(imc);

        System.out.println("Seu IMC é de: " + imcFormatada);

        sc.close();

    }
}
