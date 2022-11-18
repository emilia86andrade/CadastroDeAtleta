package br.com.ada.cadastrodeatleta;

import java.util.List;

public class Relatorios <T> {

      public void gerarRelatorioIndividualAtleta(T t){
        System.out.println("\n----Relatório Individual de Atleta----");
        System.out.println(t);
    }

    public void gerarRelatorioGeral(List<T> lista){
        System.out.println("\n----RELATORIO GERAL DE ATLETAS CADASTRADOS----");
        for (T t: lista){
            System.out.println(t);
        }
}
}
