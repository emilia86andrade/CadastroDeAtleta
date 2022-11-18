package br.com.ada.cadastrodeatleta;

public class AtletaDeJiuJitsu extends Atleta implements PagamentoInscricao <AtletaDeJiuJitsu>{

    private Faixa faixa;

    public AtletaDeJiuJitsu(String nome, String dataNascimento, Sexo sexo, String cpf, String email, Faixa faixa) {
        super(nome, dataNascimento, sexo, cpf, email);
        this.faixa = faixa;
    }

    public Faixa getFaixa() {
        return faixa;
    }

    public void setFaixa(Faixa faixa) {
        this.faixa = faixa;
    }

       @Override
    public String toString() {
        return super.toString() +
                ", **AtletaDeJiuJitsu** " +
                "faixa=" + faixa;
    }

    @Override
    public String pagarInscricaoPix(AtletaDeJiuJitsu atletaDeJiuJitsu) {
        return "Pagamento realizado por pix pelo(a) " + atletaDeJiuJitsu;
    }

    @Override
    public String pagarInscricaoCartao(AtletaDeJiuJitsu atletaDeJiuJitsu) {
        return "Pagamento realizado por cartão de crédito pelo(a) " + atletaDeJiuJitsu;
    }

    @Override
    public String bolsaAtleta(AtletaDeJiuJitsu atletaDeJiuJitsu) {
        return "Isenção de pagamento do(a) " + atletaDeJiuJitsu;
    }



}
