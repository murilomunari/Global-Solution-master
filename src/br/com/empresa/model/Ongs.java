package br.com.empresa.model;

import br.com.sistema.model.Sistema;

public class Ongs {

    private String transporte;

    private String distribuicao;

    private String validarProduto;

    private Sistema cadastro;

    public Ongs() {
    }

    public Ongs(String transporte, String distribuicao, String validarProduto, Sistema cadastro) {
        this.transporte = transporte;
        this.distribuicao = distribuicao;
        this.validarProduto = validarProduto;
        this.cadastro = cadastro;
    }


    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(String distribuicao) {
        this.distribuicao = distribuicao;
    }

    public String getValidarProduto() {
        return validarProduto;
    }

    public void setValidarProduto(String validarProduto) {
        this.validarProduto = validarProduto;
    }

    public Sistema getCadastro() {
        return cadastro;
    }

    public void setCadastro(Sistema cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "Ongs{" +
                "transporte='" + transporte + '\'' +
                ", distribuicao='" + distribuicao + '\'' +
                ", validarProduto='" + validarProduto + '\'' +
                ", cadastro=" + cadastro +
                '}';
    }
}
