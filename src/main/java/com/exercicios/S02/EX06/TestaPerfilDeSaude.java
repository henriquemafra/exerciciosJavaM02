package com.exercicios.S02.EX06;

import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        // abre scanner
        Scanner sc = new Scanner(System.in);

        // obtem informações com scanner
        System.out.println("=== Perfil de Saúde 1.0 ===");

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();
        System.out.println("Digite seu sexo:");
        String sexo = sc.nextLine();
        System.out.println("Digite o seu peso:");
        Double peso = sc.nextDouble();
        System.out.println("Digite sua altura:");
        Double altura = sc.nextDouble();
        System.out.println("Digite o dia do seu nascimento (Formato: xx Exemplo: 04)");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu nascimento (Formato: xx Exemplo: 02)");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento (Formato: xxxx Exemplo: 1994)");
        int ano = sc.nextInt();

        // instância de novo objeto
        PerfilDeSaude pessoa1 = new PerfilDeSaude(nome, sobrenome, sexo, altura, peso, dia, mes, ano);

        System.out.println("Nome do paciente: " + pessoa1.getNome() + " " + pessoa1.getSobrenome());
        System.out.println("Sexo: " + pessoa1.getSexo());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("Data de nascimento: " + pessoa1.getDia() + "/" + pessoa1.getMes() + "/" + 
        pessoa1.getAno());

        // Mostra idade em anos
        System.out.println("O paciente possuí a idade de " + pessoa1.calculaAnoNascimento() + ".");

        // Mostra o IMC
        System.out.println("IMC do paciente: " + pessoa1.calcularIMC() + ".");

        // Mostra frequência cardiaca maxima
        System.out.println("Frequência cardiaca maxima: " + pessoa1.calcularFrequenciaCardiacaMaxima() + ".");

        // Mostra frequência cardiaca alvo
        System.out.println("Frequência cardiaca alvo: " + pessoa1.calcularFrequenciaCardiacaAlvo() + ".");
        
        // fecha scanner
        sc.close();
    }
}
