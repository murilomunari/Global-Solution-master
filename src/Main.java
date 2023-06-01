import br.com.empresa.model.Empresa;
import br.com.empresa.model.Ongs;
import br.com.pessoa.model.Agricultor;
import br.com.pessoa.model.Voluntarios;
import br.com.sistema.model.Cadastramento;
import br.com.sistema.model.Pais;
import br.com.sistema.model.Sistema;

public class Main {

    public static Empresa novaEmpresa(String nome, String produtos, String CNPJ){
        Empresa ep = new Empresa();
        ep.setNome(nome);
        ep.setCNPJ(CNPJ);
        ep.setProdutos(produtos);
        return ep;
    }

    public static Voluntarios novoVoluntario(String nome, String CPF, String localizacao, String numeroTelefone){
        Voluntarios vl = new Voluntarios();
        vl.setCPF(CPF);
        vl.setLocalizacao(localizacao);
        vl.setNome(nome);
        vl.setNumeroTelefone(numeroTelefone);
        return vl;
    }

    public static Ongs novaOngs(String transporte, String distribuicao, String validarProduto){
        Ongs og = new Ongs();
        og.setTransporte(transporte);
        og.setDistribuicao(distribuicao);
        og.setValidarProduto(validarProduto);
        return og;
    }

    public static Pais novoPais(String nome, String continente){
        Pais pa = new Pais();
        pa.setContinente(continente);
        pa.setNome(nome);
        return pa;
    }

    public static Agricultor novoAgricultor(String plantacao, int qunatidade, String CPF,String nome){
        Agricultor ag = new Agricultor();
        ag.setCPF(CPF);
        ag.setNome(nome);
        ag.setQuantidade(qunatidade);
        ag.setPlantcao(plantacao);
        return ag;
    }

    public static Cadastramento novoCadastramento(String nome, String CPF, String CNPJ, String localizacao){
        Cadastramento ca = new Cadastramento();
        ca.setCNPJ(CNPJ);
        ca.setCPF(CPF);
        ca.setNome(nome);
        ca.setLocalizacao(localizacao);
        return ca;
    }

    public static void main(String[] args) {

        Agricultor murilo = novoAgricultor("trigo", 100, "123.678.094-32", "Murilo");
        Pais congo = novoPais()


    }
}