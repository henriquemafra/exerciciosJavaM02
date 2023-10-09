package com.exercicios.S02.EX03;

/*
 * Crie uma classe Retangulo com os atributos comprimento e largura, 
 * cada um dos quais assume o valor padrão de 1. Forneça os métodos que calculam 
 * o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento e 
 * a largura. Os métodos set devem verificar se comprimento e largura são, cada um,
 * números de ponto flutuante maiores que 0,0 e menores que 20,0. 
 * Escreva um programa para testar a classe Retangulo.
 */

public class Retangulo {
    double comprimento = 1;
    double largura = 1;
    
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) throws IllegalArgumentException {
        if (validarComprimento(comprimento)) {
            this.comprimento = comprimento;
        } else {
            throw new IllegalArgumentException("Comprimento inválido");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (validarLargura(largura)) {
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("Largura inválida");
        }
    }

    // metodo para calcular perimetro do retangulo
    public double calcularPerimetro() {
        return ((largura * 2) + (comprimento * 2));
    }
    // metodo para calcular area do retangulo
    public double calcularArea() {
        return (largura * comprimento);
    }

    // validar setters
    private boolean validarComprimento(double comprimento) {
        return (comprimento > 0.0 && comprimento <= 20.0);
    }
    private boolean validarLargura(double largura) {
        return (largura > 0.0 && largura <= 20.0);
    }
}
