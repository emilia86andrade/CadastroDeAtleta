package br.com.ada.cadastrodeatleta;

public interface PagamentoInscricao {

    String pagarInscricaoPix(AtletaDeMountainBike atletaDeMountainBike);

    String pagarInscricaoCartao(AtletaDeMountainBike atletaDeMountainBike);

    String bolsaAtleta(AtletaDeMountainBike atletaDeMountainBike);
}
