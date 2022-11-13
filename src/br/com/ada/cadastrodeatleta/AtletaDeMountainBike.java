package br.com.ada.cadastrodeatleta;

public class AtletaDeMountainBike extends Atleta{
    //private int numeroInscricao;
    private CategoriaDoAtleta categoriaDoAtleta;

    public AtletaDeMountainBike(String nome, String dataNascimento, Sexo sexo, String cpf, String email, CategoriaDoAtleta categoriaDoAtleta) {
        super(nome, dataNascimento, sexo, cpf, email);
        this.categoriaDoAtleta = categoriaDoAtleta;
    }

    public CategoriaDoAtleta getCategoriaDoAtleta() {
        return categoriaDoAtleta;
    }

    public void setCategoriaDoAtleta(CategoriaDoAtleta categoriaDoAtleta) {
        this.categoriaDoAtleta = categoriaDoAtleta;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", **AtletaDeMountainBike** " +
                "categoriaDoAtleta= " + categoriaDoAtleta;
    }
}
