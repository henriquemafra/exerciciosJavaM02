package com.exercicios.S01;
import java.text.DecimalFormat;

import java.util.Scanner;
/*
 * Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para
 *  inserir as notas do semestre, e deve retornar a média final. O programa deve pedir 3 notas, 
 * que devem ser números reais, e retornar um número real 
 * com 2 casas depois da vírgula, com o texto “Sua média final é:” seguido do valor.
 */
public class ExercicioS01Ex05 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calcula Média 1.0 ===");
        System.out.println();

        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = sc.nextDouble();

        double mediaFinal  = (nota1 + nota2 + nota3) / 3;
        DecimalFormat df = new DecimalFormat("#.##");
        String mediaFormatada = df.format(mediaFinal);

        System.out.println("Sua média final é: " + mediaFormatada);
        sc.close();
    }
}
