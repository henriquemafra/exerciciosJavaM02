package com.exercicios.S02.EX05;

import java.time.LocalDate;
import java.time.Period;

/*
 * Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver
 * se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos.
 * Segundo a American Heart Association (AHA), a fórmula para calcular a frequência cardíaca máxima por
 * minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua 
 * frequência cardíaca máxima.

[Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo 
podem variar com base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional 
de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.]‌

Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem incluir o nome, sobrenome e data 
de nascimento da pessoa. Sua classe deve ter um construtor que receba esses dados como parâmetros. Para 
cada atributo, forneça métodos set e get.
A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne 
a frequência cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um 
aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe FrequenciaCardiaca e 
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — 
calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência 
cardíaca alvo.

 */
public class FrequenciaCardiaca {
    String nome;
    String sobrenome;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
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

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    // metodo calcular data em anos
    public int calculaAnoNascimento() {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();
        return idade;
    }

    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calculaAnoNascimento();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        double frequenciaMinima = frequenciaMaxima * 0.5; // 50% da frequência máxima
        double frequenciaMaximaAlvo = frequenciaMaxima * 0.85; // 85% da frequência máxima
        return frequenciaMinima + " - " + frequenciaMaximaAlvo;
    }
    
}
