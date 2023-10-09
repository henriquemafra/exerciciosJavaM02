package com.exercicios.S03.EX03;
/*
a) Crie uma classe 'Contador'.
b) Crie um método estático (static) 'contarPalavras' que recebe uma frase (String) como argumento.
c) Implemente o método imprimindo no console o número de palavras da frase recebida como parâmetro.
d) Crie um método main em outra classe para testar a implementação.
Dicas:
- Usar método split() da String ou classe StringTokenizer. 
*/
public class Contador {

    public static int contarPalavras(String frase) {
        String[] palavras = frase.split(" ");
        return palavras.length;
    }

    public static void main(String[] args) {
        String frase = "abc abc abc abc abc abc abc";
        int numeroDePalavras = contarPalavras(frase);
        System.out.println("Número de palavras na frase: " + numeroDePalavras);
    }
    
}
