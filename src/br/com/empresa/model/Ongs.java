package br.com.empresa.model;

import br.com.sistema.model.Cliente;

public class Ongs {

    private String nome;

    private String paisDestinatario;

    private String distribuicao;

    private Cliente ongs;

    public Ongs() {
    }

    public Ongs(String nome, String paisDestinatario, String distribuicao) {
        this.nome = nome;
        this.paisDestinatario = paisDestinatario;
        this.distribuicao = distribuicao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisDestinatario() {
        return paisDestinatario;
    }

    public void setPaisDestinatario(String paisDestinatario) {
        this.paisDestinatario = paisDestinatario;
    }

    public String getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(String distribuicao) {
        this.distribuicao = distribuicao;
    }

    public Cliente getOngs() {
        return ongs;
    }

    public void setOngs(Cliente ongs) {
        this.ongs = ongs;
    }

    @Override
    public String toString() {
        return "Ongs{" +
                "nome='" + nome + '\'' +
                ", paisDestinatario='" + paisDestinatario + '\'' +
                ", distribuicao='" + distribuicao + '\'' +
                ", ongs=" + ongs +
                '}';
    }
}

