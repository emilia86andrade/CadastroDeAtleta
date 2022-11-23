package br.com.ada.cadastrodeatleta.pagamento;

public interface PagamentoInscricao<T> {
    String pagarInscricaoPix(T t);

    String pagarInscricaoCartao(T t);

    String bolsaAtleta(T t);
}
