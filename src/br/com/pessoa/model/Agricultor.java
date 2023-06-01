package br.com.pessoa.model;

import br.com.empresa.model.Ongs;
import br.com.sistema.model.Sistema;

public class Agricultor {

    private String plantcao;

    private int quantidade;

    private String nome;

    private String CPF;

    private Sistema cadastro;

    private Ongs distribuicao;

    public Agricultor() {
    }

    public Agricultor(String plantcao, int quantidade, String nome, String CPF, Sistema cadastro, Ongs distribuicao) {
        this.plantcao = plantcao;
        this.quantidade = quantidade;
        this.nome = nome;
        this.CPF = CPF;
        this.cadastro = cadastro;
        this.distribuicao = distribuicao;
    }


    public String getPlantcao() {
        return plantcao;
    }

    public void setPlantcao(String plantcao) {
        this.plantcao = plantcao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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

    public Sistema getCadastro() {
        return cadastro;
    }

    public void setCadastro(Sistema cadastro) {
        this.cadastro = cadastro;
    }

    public Ongs getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Ongs distribuicao) {
        this.distribuicao = distribuicao;
    }

    @Override
    public String toString() {
        return "Agricultor{" +
                "plantcao='" + plantcao + '\'' +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", cadastro=" + cadastro +
                ", distribuicao=" + distribuicao +
                '}';
    }
}
