import br.com.empresa.model.Empresa;
import br.com.empresa.model.Ongs;
import br.com.empresa.model.Pais;
import br.com.pessoa.model.Agricultor;
import br.com.pessoa.model.Voluntarios;
import br.com.sistema.model.Cliente;


public class Main {

    public static Empresa novaEmpresa(String nome, String produtos, String CNPJ, String ajudaFinanceira, Ongs distribuicao, Cliente empresa){
        Empresa ep = new Empresa();
        ep.setNome(nome);
        ep.setCNPJ(CNPJ);
        ep.setProdutos(produtos);
        ep.setAjudaFinaceira(ajudaFinanceira);
        ep.setDistribuicao(distribuicao);
        ep.setEmpresa(empresa);
        return ep;
    }

    public static Voluntarios novoVoluntario(String nome, String CPF, String localizacao, String numeroTelefone, Cliente voluntarios){
        Voluntarios vl = new Voluntarios();
        vl.setCPF(CPF);
        vl.setLocalizacao(localizacao);
        vl.setNome(nome);
        vl.setNumeroTelefone(numeroTelefone);
        vl.setVoluntarios(voluntarios);
        return vl;
    }

    public static Ongs novaOngs(String nome,String distribuicao, String paisDestinatario, Cliente ongs){
        Ongs og = new Ongs();
        og.setNome(nome);
        og.setOngs(ongs);
        og.setDistribuicao(distribuicao);
        og.setPaisDestinatario(paisDestinatario);
        return og;
    }

    public static Pais novoPais(String nome, String continente){
        Pais pa = new Pais();
        pa.setNome(nome);
        pa.setContinente(continente);
        return pa;
    }

    public static Agricultor novoAgricultor(String plantacao, int qunatidade, String CPF,String nome, Ongs distribuicao, Cliente agricultor){
        Agricultor ag = new Agricultor();
        ag.setCPF(CPF);
        ag.setNome(nome);
        ag.setQuantidade(qunatidade);
        ag.setPlantacao(plantacao);
        ag.setAgricultor(agricultor);
        ag.setDistribuicao(distribuicao);
        return ag;
    }



    public static void main(String[] args) {



    }
}