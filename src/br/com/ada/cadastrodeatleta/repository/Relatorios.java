package br.com.ada.cadastrodeatleta.repository;

import java.util.List;

//essa classe representa o princípio de responsabilidade única - SRP - Single Responsibility Principle

public class Relatorios<T> {

    public void gerarRelatorioIndividualAtleta(T t) {
        System.out.println("\n----Relatório Individual de Atleta----");
        System.out.println(t);
    }

    public void gerarRelatorioGeral(List<T> lista) {
        System.out.println("\n----RELATORIO GERAL DE ATLETAS CADASTRADOS----");
        for (T t : lista) {
            System.out.println(t);
        }
    }
}
