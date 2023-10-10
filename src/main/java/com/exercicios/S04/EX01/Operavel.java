package com.exercicios.S04.EX01;
/*a) Crie a interface "Operavel", com os métodos depositar(double valor) e sacar(double valor).
b) Crie a classe Abstrata Conta com o atributo "saldo" (double) e um método protegido (protected) 
"ObterSaldoAtual()".
c) Crie uma classe "ContaCorrente" que implemente a interface Operavel e herde da classe Conta. 
Faça uma implementação dos métodos herdados. */
public interface Operavel {
    void depositar(double valor);
    void sacar(double sacar);    
}
