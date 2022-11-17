package br.com.ada.cadastrodeatleta;

import java.util.List;

public class Relatorios <T> {

      public void gerarRelatorioAtletaMountainBike(T t){
        System.out.println("----Lista de Atletas de MountainBike----");
        System.out.println(t);
    }

    public void gerarRelatorioGeral(List<T> lista){
        System.out.println("## RELATORIO GERAL DE ATLETAS CADASTRADOS ##");
        for (T t: lista){
            System.out.println(t);
        }
}
}
