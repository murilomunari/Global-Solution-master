import br.com.empresa.model.Empresa;
import br.com.empresa.model.Ongs;
import br.com.pessoa.model.Agricultor;
import br.com.pessoa.model.Voluntarios;
import br.com.sistema.model.Cliente;

import javax.swing.*;

public class Main {

    public static Empresa novaEmpresa(String nome, String produtos, String CNPJ, int ajudaFinanceira){
        Empresa ep = new Empresa();
        ep.setNome(nome);
        ep.setCNPJ(CNPJ);
        ep.setProdutos(produtos);
        ep.setAjudaFinaceira(ajudaFinanceira);
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

    public static Ongs novaOngs(String nome,String distribuicao, String paisDestinatario){
        Ongs og = new Ongs();
        og.setNome(nome);
        og.setDistribuicao(distribuicao);
        og.setPaisDestinatario(paisDestinatario);
        return og;
    }

    public static Agricultor novoAgricultor(String plantacao, int quantidade, String CPF,String nome){
        Agricultor ag = new Agricultor();
        ag.setCPF(CPF);
        ag.setNome(nome);
        ag.setQuantidade(quantidade);
        ag.setPlantacao(plantacao);
        return ag;
    }

    public static Cliente novoCliente(String nome, String CPF, String CNPJ, String localizacao){
        Cliente cl = new Cliente();
        cl.setNome(nome);
        cl.setCNPJ(CNPJ);
        cl.setCPF(CPF);
        cl.setLocalizacao(localizacao);
        return cl;
    }

    public static void main(String[] args) {
        var tipoCadastro = JOptionPane.showInputDialog("Escolha o tipo de cadastro (ONG, Empresa, Voluntário, Agricultor):");

        switch (tipoCadastro.toLowerCase()) {
            case "ong":
                String nomeOng = JOptionPane.showInputDialog("Digite o nome da ONG:");
                String distribuicao = JOptionPane.showInputDialog("Digite a forma de distribuição:");
                String paisDestinatario = JOptionPane.showInputDialog("Digite o país destinatário:");
                Ongs ong = novaOngs(nomeOng, distribuicao, paisDestinatario);
                System.out.println("Cadastro da ONG realizado: " + ong);
                break;
            case "empresa":
                String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da Empresa:");
                String produtos = JOptionPane.showInputDialog("Digite os produtos da Empresa:");
                String cnpj = JOptionPane.showInputDialog("Digite o CNPJ da Empresa:");
                int ajudaFinanceira = Integer.parseInt(JOptionPane.showInputDialog("Digite a ajuda financeira da Empresa:"));
                Empresa empresa = novaEmpresa(nomeEmpresa, produtos, cnpj, ajudaFinanceira);
                System.out.println("Cadastro da Empresa realizado: " + empresa);
                break;
            case "voluntário":
                String nomeVoluntario = JOptionPane.showInputDialog("Digite o nome do Voluntário:");
                String cpfVoluntario = JOptionPane.showInputDialog("Digite o CPF do Voluntário:");
                String localizacaoVoluntario = JOptionPane.showInputDialog("Digite a localização do Voluntário:");
                String numeroTelefoneVoluntario = JOptionPane.showInputDialog("Digite o número de telefone do Voluntário:");
                Voluntarios voluntario = novoVoluntario(nomeVoluntario, cpfVoluntario, localizacaoVoluntario, numeroTelefoneVoluntario);
                System.out.println("Cadastro do Voluntário realizado: " + voluntario);
                break;
            case "agricultor":
                String plantacao = JOptionPane.showInputDialog("Digite o tipo de plantação do Agricultor:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Agricultor:"));
                String cpfAgricultor = JOptionPane.showInputDialog("Digite o CPF do Agricultor:");
                String nomeAgricultor = JOptionPane.showInputDialog("Digite o nome do Agricultor:");
                Agricultor agricultor = novoAgricultor(plantacao, quantidade, cpfAgricultor, nomeAgricultor);
                System.out.println("Cadastro do Agricultor realizado: " + agricultor);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
