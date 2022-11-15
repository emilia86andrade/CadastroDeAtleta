package br.com.ada.cadastrodeatleta;

public class AtletasInscritos {

    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Marcio", "25/09/1985", Sexo.MASCULINO, "123.456.789-12",
        "mhsjoliveira@gmail.com");

        Atleta atleta2 = new Atleta("Fabiola", "01/02/1978", Sexo.FEMININO, "456.789.123-56",
                "fabi@gmail.com");


        AtletaDeMountainBike atletaDeMountainBike1 = new AtletaDeMountainBike("Emilia", "31/01/1986",
                Sexo.FEMININO, "123.456.789.11", "emilia86andrade@gmail.com", CategoriaDoAtletaMountainBike.ELITE_FEMININO);

        AtletaDeMountainBike atletaDeMountainBike2 = new AtletaDeMountainBike("Jack", "15/08/1957",
                Sexo.FEMININO, "789.456.123-32", "jack@gmail.com", CategoriaDoAtletaMountainBike.ELITE_FEMININO);

        AtletaDeMountainBike atletaDeMountainBike3 = new AtletaDeMountainBike("Flor", "01/09/1961",
                Sexo.FEMININO, "987.654.369-58", "flor@gmail.com", CategoriaDoAtletaMountainBike.ELITE_FEMININO);


        AtletaRepository atletaRepository = new AtletaRepository();
        atletaRepository.cadastra(atletaDeMountainBike1);
        atletaRepository.cadastra(atletaDeMountainBike2);
        atletaRepository.cadastra(atletaDeMountainBike3);
        atletaRepository.cadastra(atleta1);
        atletaRepository.cadastra(atleta2);
        atletaRepository.imprimeAtleta();


        System.out.println("\n-------Meios de Pagamento-------");
        System.out.println(atletaDeMountainBike1.pagarInscricaoPix(atletaDeMountainBike1));
        System.out.println(atletaDeMountainBike2.pagarInscricaoCartao(atletaDeMountainBike2));
        System.out.println(atletaDeMountainBike3.bolsaAtleta(atletaDeMountainBike3));






    }
}
