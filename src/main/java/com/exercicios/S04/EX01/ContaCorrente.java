package com.exercicios.S04.EX01;
/*a) Crie a interface "Operavel", com os métodos depositar(double valor) e sacar(double valor).
b) Crie a classe Abstrata Conta com o atributo "saldo" (double) e um método protegido (protected) 
"ObterSaldoAtual()".
c) Crie uma classe "ContaCorrente" que implemente a interface Operavel e herde da classe Conta. 
Faça uma implementação dos métodos herdados. */
public class ContaCorrente extends Conta implements Operavel {

    public void depositar(double valor) {
        if(valor > 0)
        saldo += valor;
        else
        throw new IllegalArgumentException("Deposite um valor maior que 0.");
    }

    public void sacar(double sacar) {
        if(saldo >= sacar)
        saldo -= sacar;
        else 
        throw new IllegalArgumentException("Seu saldo é insuficiente.");
    }
    
}
