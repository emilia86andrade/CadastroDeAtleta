package br.com.ada.cadastrodeatleta;

public class Atleta {

    private String nome;
    private String dataNascimento;
    private Sexo sexo;
    private String cpf;
    private String email;
    private int numeroInscricao;

    public Atleta(String nome, String dataNascimento, Sexo sexo, String cpf, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        //this.numeroInscricao = numeroInscricao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(int numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    @Override
    public String toString() {
        return "Atleta: " +
                "nome= " + nome +
                ", dataNascimento= " + dataNascimento +
                ", sexo= " + sexo +
                ", cpf= " + cpf +
                ", email= " + email +
                ", numeroInscricao= " + numeroInscricao;
    }


}