package br.com.ada.cadastrodeatleta;

public class AtletaDeMountainBike extends Atleta implements PagamentoInscricao{

    private CategoriaDoAtletaMountainBike categoriaDoAtleta;

    public AtletaDeMountainBike(String nome, String dataNascimento, Sexo sexo, String cpf, String email,
                                CategoriaDoAtletaMountainBike categoriaDoAtleta) {
        super(nome, dataNascimento, sexo, cpf, email);
        this.categoriaDoAtleta = categoriaDoAtleta;
    }

    public CategoriaDoAtletaMountainBike getCategoriaDoAtleta() {
        return categoriaDoAtleta;
    }

    public void setCategoriaDoAtleta(CategoriaDoAtletaMountainBike categoriaDoAtleta) {
        this.categoriaDoAtleta = categoriaDoAtleta;
    }

    @Override
    public String pagarInscricaoPix(AtletaDeMountainBike atletaDeMountainBike) {
        return "Pagamento realizado por pix pelo(a) " + atletaDeMountainBike;
    }

    @Override
    public String pagarInscricaoCartao(AtletaDeMountainBike atletaDeMountainBike) {
        return "Pagamento realizado por cartão de crédito pelo(a) " + atletaDeMountainBike;
    }

    @Override
    public String bolsaAtleta(AtletaDeMountainBike atletaDeMountainBike) {
        return "Isenção de pagamento do(a) " + atletaDeMountainBike;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", **AtletaDeMountainBike** " +
                "categoriaDoAtleta= " + categoriaDoAtleta;
    }


}
