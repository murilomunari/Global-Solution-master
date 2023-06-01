package br.com.pessoa.model;

import br.com.empresa.model.Ongs;
import br.com.sistema.model.Sistema;

public class Agricultor {

    private String plantcao;

    private int quantidade;

    private Sistema cadastro;

    private Ongs distribuicao;

    public Agricultor() {
    }

    public Agricultor(String plantcao, int quantidade, Sistema cadastro, Ongs distribuicao) {
        this.plantcao = plantcao;
        this.quantidade = quantidade;
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
                ", cadastro=" + cadastro +
                ", distribuicao=" + distribuicao +
                '}';
    }
}
