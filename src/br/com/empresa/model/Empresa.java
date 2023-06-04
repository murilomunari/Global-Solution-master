package br.com.empresa.model;


import br.com.sistema.model.Cliente;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Empresa {

   private String nome;

   private String CNPJ;

   private String produtos;

   private int ajudaFinaceira;

   private Ongs distribuicao;

   private Cliente Empresa;

   private Collection<Empresa> colaboladores = new Vector<>();

    public Empresa() {
    }

    public Empresa addColaboladores(Empresa colaboladores){
        this.getColaboladores().add(colaboladores);
        return this;
    }

    public Empresa removeColaboladores(Empresa colaboladores){
        this.getColaboladores().remove(colaboladores);
        return this;
    }

    public Collection<Empresa> getColaboladores(){
        return Collections.unmodifiableCollection(this.colaboladores);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public int getAjudaFinaceira() {
        return ajudaFinaceira;
    }

    public void setAjudaFinaceira(int ajudaFinaceira) {
        this.ajudaFinaceira = ajudaFinaceira;
    }

    public Ongs getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Ongs distribuicao) {
        this.distribuicao = distribuicao;
    }

    public Cliente getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(Cliente empresa) {
        Empresa = empresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                ", produtos='" + produtos + '\'' +
                ", ajudaFinaceira='" + ajudaFinaceira + '\'' +
                ", distribuicao=" + distribuicao +
                ", colaboladores=" + colaboladores +
                '}';
    }


}


