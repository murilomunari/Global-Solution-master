package br.com.sistema.model;

import br.com.empresa.model.Ongs;

public class Pais {

    private String nome;

    private String continente;

    private Ongs recebimento;

    public Pais() {
    }

    public Pais(String nome, String continente, Ongs recebimento) {
        this.nome = nome;
        this.continente = continente;
        this.recebimento = recebimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Ongs getRecebimento() {
        return recebimento;
    }

    public void setRecebimento(Ongs recebimento) {
        this.recebimento = recebimento;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", continente='" + continente + '\'' +
                ", recebimento=" + recebimento +
                '}';
    }
}
