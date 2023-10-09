package com.exercicios.S02.EX05;

import java.util.Scanner;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Frequência Cardiaca 1.0 ===");
        System.out.println();
         
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();
        System.out.println("Digite o dia do seu nascimento:");
        int dia = sc.nextInt();
        System.out.println("Digite o mes do seu nascimento(Em números. ex: 02):");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        int ano = sc.nextInt();

        FrequenciaCardiaca pessoa1 = new FrequenciaCardiaca(nome, sobrenome, dia, mes, ano);

        System.out.println("Seu resultado: ");
        System.out.println("Nome: " + pessoa1.getNome()+ " " + pessoa1.getSobrenome());
        System.out.println("Data de nascimento: " + pessoa1.getDiaNascimento() + "/" + pessoa1.getMesNascimento() + "/" + pessoa1.getAnoNascimento());
        System.out.println("Utilizaremos como base para calcular seu frenquência cardiaca a sua idade que é " +
        pessoa1.calculaAnoNascimento() + " anos.");

        int frequenciaMaxima = pessoa1.calcularFrequenciaCardiacaMaxima();
        System.out.println("Frequência Cardíaca Máxima: " + frequenciaMaxima + " bpm.");

        String frequenciaAlvo = pessoa1.calcularFrequenciaCardiacaAlvo();
        System.out.println("Frequência Cardíaca Alvo: " + frequenciaAlvo + " bpm.");

        sc.close();
    }
}
