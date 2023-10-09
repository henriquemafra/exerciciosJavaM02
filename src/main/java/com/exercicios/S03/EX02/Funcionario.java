package com.exercicios.S03.EX02;
/*
a) Crie uma classe 'Funcionario' com os atributos 'nome' (String) e 'salário' (Float).
b) Implemente um construtor que receba um argumento de nome e inicialize o atributo de 'nome' com este valor.
c) Implemente outro construtor que receba como argumentos nome e salário e inicialize os respectivos atributos.
d) Implemente um método público 'aumentar' que recebe como parâmetro um valor (Float). Na implementação, some este valor ao 'salário'.
e) Implemente outro método público 'aumentar' que recebe como parâmetros um valor (Float) e uma commissão (Float). Na implementação,
some ambos os valores ao 'salário'. */

public class Funcionario {

    private String nome;
    private float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public void aumentarSalario(float aumento) {
        salario += aumento;
    }

    public void aumentarSalario(float aumento, float comissao) {
        salario += aumento + comissao;
    }
}
