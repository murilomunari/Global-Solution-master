package br.com.empresa.model;

public class Pais extends Ongs{

    private String nome;

    private String continente;

    public Pais() {
    }

    public Pais(String nome, String continente) {
        this.nome = nome;
        this.continente = continente;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", continente='" + continente + '\'' +
                '}';
    }
}
