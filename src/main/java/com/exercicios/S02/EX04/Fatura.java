package com.exercicios.S02.EX04;
/*
 * Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize 
 * para representar uma fatura de um item vendido nela. Uma fatura deve incluir quatro partes 
 * das informações como variáveis de instância — o número (tipo String), a descrição (tipo String), 
 * a quantidade comprada de um item (tipo int) e o preço por item (double). Sua classe deve ter um 
 * construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada 
 * variável de instância.
 * Além disso, forneça um método chamado getValorFatura que calcula o valor da fatura (isto é, multiplica 
 * a quantidade pelo preço por item) e depois retorna esse valor como double. Se a quantidade não for 
 * positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado 
 * como 0.0. Escreva um aplicativo de teste chamado TestaFatura que demonstra as capacidades da classe Fatura.

 */
public class Fatura {
    String faturaId;
    String faturaDescricao;
    int quantidadeItems;
    double precoItem;

    public Fatura(String faturaId, String faturaDescricao, int quantidadeItems, double precoItem) {
        this.faturaId = faturaId;
        this.faturaDescricao = faturaDescricao;
        this.quantidadeItems = quantidadeItems;
        this.precoItem = precoItem;
    }

    public String getFaturaId() {
        return faturaId;
    }

    public void setFaturaId(String faturaId) {
        this.faturaId = faturaId;
    }

    public String getFaturaDescricao() {
        return faturaDescricao;
    }

    public void setFaturaDescricao(String faturaDescricao) {
        this.faturaDescricao = faturaDescricao;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }

    public void setQuantidadeItems(int quantidadeItems) {
        if(quantidadeItems < 0) {
        this.quantidadeItems = 0;
        } else {
             this.quantidadeItems = quantidadeItems;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if(precoItem < 0) {
        this.precoItem = 0;
        } else {
             this.precoItem = precoItem;
        }
    }

    // Metodo calcula o valor da fatura
    public double getValorFatura() {
        return (quantidadeItems * precoItem);
    }

}
