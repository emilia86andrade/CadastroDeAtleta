package br.com.ada.cadastrodeatleta;


import java.util.Objects;

public class AtletaRepository {

    private int count = 0;

    //numero máximo de atletas inscritos por prova
    private Atleta[] atletaCadastrado = new Atleta[100];

    private static int numeroInscricao = 1;

    public void cadastra(Atleta atleta){
        setNumeroInscricao(atleta);

        if(Objects.nonNull(atleta) && Objects.nonNull(atleta.getNome())){
            atletaCadastrado[count] = atleta;
            count++;
        } else{
            System.out.println("Preencha corretamente os dados");
        }
    }

    private void setNumeroInscricao(Atleta atleta) {
        atleta.setNumeroInscricao(numeroInscricao);
       numeroInscricao ++;
    }

    public void imprimeAtleta(){
        System.out.println("\n_____________LISTA DE TODOS OS ATLETAS CADASTRADOS_____________");
        boolean existeAtletaCadastrado = false;
        for (Atleta atleta: atletaCadastrado){
            if (Objects.nonNull(atleta)){
                existeAtletaCadastrado = true;
                   System.out.println(atleta);
        }
    }
}}


