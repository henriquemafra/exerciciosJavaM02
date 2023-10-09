package com.exercicios.S02.EX02;
/*
 * Crie uma classe PessoaFisica e pense em quais atributos ela deve possuir. Um deles, 
 * obrigatoriamente, será o CPF. Garanta que nenhuma pessoa física seja criada sem um CPF,
 *  e que nenhuma pessoa física possua um CPF inválido.
 *  (Não é preciso criar o algoritmo de validação de CPF, apenas a assinatura do método)
 */
public class PessoaFisica {
    String cpf;
    String nome;
    String sobrenome;

    public PessoaFisica(String cpf, String nome, String sobrenome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf (String cpf) throws IllegalArgumentException {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private boolean validarCpf(String cpf) {
        // Implementar a validação do CPF
        return true; 
    }
    
}
