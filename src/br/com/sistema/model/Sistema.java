package br.com.sistema.model;

public class Sistema {

    private String informacao;

    private String validacaoAgricultor;

    private String validacaoVoluntario;

    private String validacaoOngs;

    public Sistema() {
    }

    public Sistema(String informacao, String validacaoAgricultor, String validacaoVoluntario, String validacaoOngs) {
        this.informacao = informacao;
        this.validacaoAgricultor = validacaoAgricultor;
        this.validacaoVoluntario = validacaoVoluntario;
        this.validacaoOngs = validacaoOngs;
    }


    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getValidacaoAgricultor() {
        return validacaoAgricultor;
    }

    public void setValidacaoAgricultor(String validacaoAgricultor) {
        this.validacaoAgricultor = validacaoAgricultor;
    }

    public String getValidacaoVoluntario() {
        return validacaoVoluntario;
    }

    public void setValidacaoVoluntario(String validacaoVoluntario) {
        this.validacaoVoluntario = validacaoVoluntario;
    }

    public String getValidacaoOngs() {
        return validacaoOngs;
    }

    public void setValidacaoOngs(String validacaoOngs) {
        this.validacaoOngs = validacaoOngs;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "informacao='" + informacao + '\'' +
                ", validacaoAgricultor='" + validacaoAgricultor + '\'' +
                ", validacaoVoluntario='" + validacaoVoluntario + '\'' +
                ", validacaoOngs='" + validacaoOngs + '\'' +
                '}';
    }
}
