package com.exercicios.S02.EX03;

public class TestaRetangulo {
    public static void main(String[] args) {
        // Criando um retângulo com comprimento e largura válidos
        Retangulo retangulo1 = new Retangulo(10.0, 5.0);

        // Exibindo os atributos do retângulo
        System.out.println("Comprimento: " + retangulo1.getComprimento());
        System.out.println("Largura: " + retangulo1.getLargura());

        // Calculando e exibindo o perímetro e a área do retângulo
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());
        System.out.println("Área: " + retangulo1.calcularArea());

        // Tentando definir um comprimento inválido
        try {
            retangulo1.setComprimento(25.0); // Isso deve lançar uma exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir comprimento: " + e.getMessage());
        }

        // Criando um retângulo com valores padrão
        Retangulo retangulo2 = new Retangulo(1.0, 1.0);

        // Exibindo os atributos do retângulo 2
        System.out.println("Comprimento (retângulo 2): " + retangulo2.getComprimento());
        System.out.println("Largura (retângulo 2): " + retangulo2.getLargura());
    }
}
