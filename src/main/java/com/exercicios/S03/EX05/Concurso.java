package com.exercicios.S03.EX05;
/*Vamos criar uma funcionalidade de manipulação dos resultados de sorteios da mega-sena dividido em 
várias partes/exercícios.

A mega-sena trata-se de um sorteio de seis números de 1 a 60, e o grande ganhador é quem acertar 
estes seis números sorteados.

a) Primeiro crie uma classe 'Concurso' para representar um concurso/sorteio.
b) Nesta classe, crie os atributos privados abaixo e os respectivos métodos getters & setters:
private Integer numero;
private LocalDate data;
private int[] sorteados;
c) Implemente também o método 'toString()' nesta classe.
d) Adicione o construtor padrão/default, e um construtor que receba parâmetros para inicializar cada atributo 
desta classe.
e) Crie uma classe 'Principal' com método 'main'. Neste método, implemente a leitura do arquivo em anexo 
contendo o resultados de sorteios
da mega-sena, e para cada linha, instancie um objeto de 'Concurso' e armazene eles em um ArrayList 
para manipulação posterior.
f) Imprima esta lista de concursos carregadas a partir do arquivo no console.

Dicas:
- Como é um arquivo csv, usar o método split() para separar os itens, e depois instanciar um objeto 
concurso para cada linha do arquivo, carregando os atributos com os valores.
- Para imprimir os itens de um array, pode-se usar o método utilitário 'Arrays.toString()'.
 */

import java.time.LocalDate;
import java.util.Arrays;

public class Concurso {

    private Integer numero;
    private int[] sorteados;
    private LocalDate data;
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public int[] getSorteados() {
        return sorteados;
    }

    public void setSorteados(int[] sorteados) {
        this.sorteados = sorteados;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Concurso() {
        this.numero = null;
        this.sorteados = null;
        this.data = null;
    }

    public Concurso(Integer numero, int[] sorteados, LocalDate data) {
        this.numero = numero;
        this.sorteados = sorteados;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Concurso [numero=" + numero + ", sorteados=" + Arrays.toString(sorteados) + ", data=" + data + "]";
    }
    
    
}
