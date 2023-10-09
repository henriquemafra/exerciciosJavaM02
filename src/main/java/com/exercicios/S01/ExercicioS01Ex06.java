package com.exercicios.S01;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário 
 * sua data de nascimento e calcule a sua idade.
   Se o usuário tiver 16, 17, ou mais de 59 anos, o voto é opcional.
   Entre 18 e 59 anos, o voto é obrigatório.
   Abaixo de 16, o voto é proibido.
   Informe ao usuário a situação de voto.
*/

public class ExercicioS01Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Posso Votar? 1.0 ===");
        System.out.println("Digite o dia do seu nascimento:");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento:");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        int ano = sc.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        
        int idade = periodo.getYears();

        System.out.println(idade);

        if(idade == 16 | idade == 17 | idade > 59) {
            System.out.println("Seu voto é opcional.");
        } else if (idade > 17 & idade < 59) {
            System.out.println("Seu voto é obrigatório.");
        } else {
            System.out.println("Seu voto não é permitido.");
        }
        sc.close();
    }
}
