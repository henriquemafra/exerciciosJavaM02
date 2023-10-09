package com.exercicios.S03.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String caminhoDoArquivo = "src/main/java/com/exercicios/S03/EX05/numeros.txt";

        ArrayList<Concurso> concursos = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(caminhoDoArquivo));

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();

                String[] valores = linha.split(",");

                if (valores.length >= 8) {
                    Integer numeroConcurso = Integer.parseInt(valores[0].trim());
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate data = LocalDate.parse(valores[1].trim(), formatter);
                    int[] numerosSorteados = new int[6];
                    for (int i = 2; i < 8; i++) {
                        numerosSorteados[i - 2] = Integer.parseInt(valores[i].trim());
                    }

                    Concurso concurso = new Concurso(numeroConcurso, numerosSorteados, data);

                    concursos.add(concurso);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + caminhoDoArquivo);
            e.printStackTrace();
        }
        for (Concurso concurso : concursos) {
            System.out.println("Número do Concurso: " + concurso.getNumero());
            System.out.println("Data: " + concurso.getData());
            System.out.println("Números Sorteados: " + Arrays.toString(concurso.getSorteados()));
            System.out.println(); // Para separar os resultados
        }
    }

}
