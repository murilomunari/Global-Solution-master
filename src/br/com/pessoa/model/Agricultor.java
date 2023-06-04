package br.com.pessoa.model;

import br.com.empresa.model.Ongs;
import br.com.sistema.model.Cliente;

public class Agricultor {

    private String nome;

    private int quantidade;

    private String plantacao;

    private String CPF;

    private Ongs distribuicao;

    private Cliente agricultor;

    public Agricultor() {
    }

    public Agricultor(String nome, int quantidade, String plantacao, String CPF) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.plantacao = plantacao;
        this.CPF = CPF;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPlantacao() {
        return plantacao;
    }

    public void setPlantacao(String plantacao) {
        this.plantacao = plantacao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Ongs getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Ongs distribuicao) {
        this.distribuicao = distribuicao;
    }

    public Cliente getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Cliente agricultor) {
        this.agricultor = agricultor;
    }


    @Override
    public String toString() {
        return "Agricultor{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", plantacao='" + plantacao + '\'' +
                ", CPF='" + CPF + '\'' +
                ", distribuicao=" + distribuicao +
                ", agricultor=" + agricultor +
                '}';
    }
}
