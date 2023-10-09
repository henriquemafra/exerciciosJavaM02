package com.exercicios.S02.EX06;

import java.time.LocalDate;
import java.time.Period;

/*A digitalização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis 
e históricos de saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da 
assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos, reduza 
custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe PerfilDeSaude 
para uma pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento, 
altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba 
esses dados.‌

Para cada atributo, analise a necessidade de fornecer métodos set e get. A classe também deve 
incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de frequência cardíaca 
máxima e frequência cardíaca alvo (vide exercício anterior), além de índice de massa corporal (IMC, 
pesquise a fórmula).‌

Escreva um aplicativo Java que solicite as informações da pessoa (utilize Scanner), instancie um 
objeto da classe PerfilDeSaude para ela e imprima as informações a partir desse objeto — incluindo 
nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e então calcule e imprima 
a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo.
 */
public class PerfilDeSaude {
    String nome;
    String sobrenome;
    String sexo;
    double altura;
    double peso;
    int dia, mes, ano;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, double altura, double peso, int dia, int mes,
            int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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



    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }



    public double getPeso() {
        return peso;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }



    public int getDia() {
        return dia;
    }



    public void setDia(int dia) {
        this.dia = dia;
    }



    public int getMes() {
        return mes;
    }



    public void setMes(int mes) {
        this.mes = mes;
    }



    public int getAno() {
        return ano;
    }



    public void setAno(int ano) {
        this.ano = ano;
    }


// método calcula idade
    public int calculaAnoNascimento() {
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();
        return idade;
    }
// método calcula frequência máxima
    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calculaAnoNascimento();
        return 220 - idade;
    }
// método calcula frequência alvo
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        double frequenciaMinima = frequenciaMaxima * 0.5; // 50% da frequência máxima
        double frequenciaMaximaAlvo = frequenciaMaxima * 0.85; // 85% da frequência máxima
        return frequenciaMinima + " - " + frequenciaMaximaAlvo;
    }
// método para calcular IMC
    public Double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }    
}
