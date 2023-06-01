package br.com.pessoa.model;

public class Voluntarios {

    private String nome;

    private String CPF;

    private String localizacao;

    private String numeroTelefone;

    public Voluntarios() {
    }

    public Voluntarios(String nome, String CPF, String localizacao, String numeroTelefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.localizacao = localizacao;
        this.numeroTelefone = numeroTelefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Voluntarios{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
