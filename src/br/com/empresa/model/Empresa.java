package br.com.empresa.model;


import br.com.sistema.model.Sistema;

import java.util.Collection;
import java.util.Vector;

public class Empresa {

    private String nome;

    private String produtos;

    private String CNPJ;

    private String ajudaFinaceira;

    private Ongs distribuicao;

    private Sistema cadastro;

    private Collection <Empresa> colaboradores = new Vector<>();

    public Empresa() {
    }

    public Empresa addColaboladores(Empresa colaboladores){
        this.getColaboradores().add(colaboladores);
        return this;
    }

    public Empresa removeColaboladores(Empresa colaboladores){
        this.getColaboradores().remove(colaboladores);
        return this;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getAjudaFinaceira() {
        return ajudaFinaceira;
    }

    public void setAjudaFinaceira(String ajudaFinaceira) {
        this.ajudaFinaceira = ajudaFinaceira;
    }

    public Ongs getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Ongs distribuicao) {
        this.distribuicao = distribuicao;
    }

    public Sistema getCadastro() {
        return cadastro;
    }

    public void setCadastro(Sistema cadastro) {
        this.cadastro = cadastro;
    }

    public Collection<Empresa> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(Collection<Empresa> colaboradores) {
        this.colaboradores = colaboradores;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", produtos='" + produtos + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", ajudaFinaceira='" + ajudaFinaceira + '\'' +
                ", distribuicao=" + distribuicao +
                ", cadastro=" + cadastro +
                ", colaboradores=" + colaboradores +
                '}';
    }
}


