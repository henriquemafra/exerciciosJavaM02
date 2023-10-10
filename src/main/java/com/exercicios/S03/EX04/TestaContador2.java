package com.exercicios.S03.EX04;

public class TestaContador2 {
    public static void main(String[] args) {
        Contador2 contador = new Contador2("Meu nome é Henrique e eu sou um desenvolvedor.");
        int quantidadeDePalavras = contador.contarPalavras();
        System.out.println("Esta frase tem " + quantidadeDePalavras + " palavras.");
    }
}
