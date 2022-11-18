package br.com.ada.cadastrodeatleta;

public interface PagamentoInscricao <T>{

    String pagarInscricaoPix(T t);

    String pagarInscricaoCartao(T t);

    String bolsaAtleta(T t);
}
