package br.com.sistema.model;

public class Cadastramento extends Sistema{

    private String nome;

    private String CPF;

    private String CNPJ;

    private String localizacao;

    public Cadastramento() {
    }

    public Cadastramento(String nome, String CPF, String CNPJ, String localizacao) {
        this.nome = nome;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
        this.localizacao = localizacao;
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

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Cadastramento{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}
