package com.exercicios.S02.EX04;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("1", "Item Qualquer", 500, 1);

        System.out.println("ID:" + fatura1.getFaturaId());
        System.out.println("Descrição:" + fatura1.getFaturaDescricao());
        System.out.println("Quantidade de Itens:" + fatura1.getQuantidadeItems());
        System.out.println("Preço por item:" + fatura1.getPrecoItem());

        fatura1.setPrecoItem(5);
        fatura1.setQuantidadeItems(5);

        System.out.println("Quantidade de Itens:" + fatura1.getQuantidadeItems());
        System.out.println("Preço por item:" + fatura1.getPrecoItem());

        System.out.println(fatura1.getValorFatura());
    }

}
