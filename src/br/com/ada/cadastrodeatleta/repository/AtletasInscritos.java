package br.com.ada.cadastrodeatleta.repository;

import br.com.ada.cadastrodeatleta.atletas.Atleta;
import br.com.ada.cadastrodeatleta.atletas.AtletaDeJiuJitsu;
import br.com.ada.cadastrodeatleta.atletas.AtletaDeMountainBike;
import br.com.ada.cadastrodeatleta.enumerador.CategoriaDoAtletaMountainBike;
import br.com.ada.cadastrodeatleta.enumerador.Faixa;
import br.com.ada.cadastrodeatleta.enumerador.Sexo;

import java.util.List;

public class AtletasInscritos {
    public static void main(String[] args) {

        AtletaDeMountainBike atletaDeMountainBike1 = new AtletaDeMountainBike("Emilia", "31/01/1986",
                Sexo.FEMININO, "123.456.789.11", "emilia86andrade@gmail.com", CategoriaDoAtletaMountainBike.ELITE_FEMININO);

        AtletaDeMountainBike atletaDeMountainBike2 = new AtletaDeMountainBike("Jack", "15/08/1957",
                Sexo.FEMININO, "789.456.123-32", "jack@gmail.com", CategoriaDoAtletaMountainBike.ELITE_FEMININO);

        AtletaDeMountainBike atletaDeMountainBike3 = new AtletaDeMountainBike("Flor", "01/09/1961",
                Sexo.FEMININO, "987.654.369-58", "flor@gmail.com", CategoriaDoAtletaMountainBike.ELITE_FEMININO);

        AtletaDeMountainBike atletaDeMountainBike4 = new AtletaDeMountainBike("Marcio", "25/09/1985",
                Sexo.MASCULINO, "123.456.789-58", "mhsjoliveira@gmail.com", CategoriaDoAtletaMountainBike.PRO_MASCULINO);

        AtletaDeJiuJitsu atletaDeJiuJitsu1 = new AtletaDeJiuJitsu("Leandro Lo", "15/04/1992", Sexo.MASCULINO,
                "456.789.123-58", "leandrolo@gmail.com", Faixa.PRETA);

        AtletaDeJiuJitsu atletaDeJiuJitsu2 = new AtletaDeJiuJitsu("Karina", "25/06/1990", Sexo.FEMININO,
                "741.852.963-87", "karina@gmail.com", Faixa.ROXA);

        //lista geral de todos os atletas pela classe AtletaRepository
        AtletaRepository atletaRepository = new AtletaRepository();
        atletaRepository.cadastra(atletaDeMountainBike1);
        atletaRepository.cadastra(atletaDeMountainBike2);
        atletaRepository.cadastra(atletaDeMountainBike3);
        atletaRepository.cadastra(atletaDeMountainBike4);
        atletaRepository.cadastra(atletaDeJiuJitsu1);
        atletaRepository.cadastra(atletaDeJiuJitsu2);
        atletaRepository.imprimeAtleta();

        //lista de meios de pagamento usando interface PagamentoInscricao
        System.out.println("\n-------Meios de Pagamento-------");
        System.out.println(atletaDeMountainBike1.pagarInscricaoPix(atletaDeMountainBike1));
        System.out.println(atletaDeMountainBike2.pagarInscricaoCartao(atletaDeMountainBike2));
        System.out.println(atletaDeMountainBike3.bolsaAtleta(atletaDeMountainBike3));
        System.out.println(atletaDeMountainBike3.bolsaAtleta(atletaDeMountainBike4));
        System.out.println(atletaDeJiuJitsu1.bolsaAtleta(atletaDeJiuJitsu1));
        System.out.println(atletaDeJiuJitsu1.bolsaAtleta(atletaDeJiuJitsu2));

        //Gerando relat??rio individual com Generics (T t)
        Relatorios<Atleta> relatoriosAtletas = new Relatorios();
        relatoriosAtletas.gerarRelatorioIndividualAtleta(atletaDeMountainBike2);

        //Gerando relat??rio geral com Generics (List<T> lista)
        List<Atleta> atletas = List.of(atletaDeMountainBike1, atletaDeMountainBike2, atletaDeMountainBike3,
                atletaDeMountainBike4, atletaDeJiuJitsu1, atletaDeJiuJitsu2);
        relatoriosAtletas.gerarRelatorioGeral(atletas);
    }
}
