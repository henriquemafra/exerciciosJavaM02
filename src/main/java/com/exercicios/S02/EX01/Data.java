package com.exercicios.S02.EX01;

/*
 * Crie uma classe chamada Data que inclua três variáveis de instância — mês 
 * (tipo int), dia (tipo int) e ano (tipo int). Forneça um construtor que inicializa as
 * três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método set 
 * e um get para cada variável de instância. Apresente um método exibirData que exiba mês, dia e ano separados 
 * por barras normais (/). 
 * Escreva um aplicativo de teste chamado TestaData que demonstre as capacidades da classe Data
 */

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    public void exibirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}


