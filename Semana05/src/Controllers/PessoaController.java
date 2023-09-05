package Controllers;

import DAO.postgres.PessoaDAOPostgres;
import Models.Pessoa;
import Models.PessoaFisica;
import Models.PessoaJuridica;
import Util.GerenciadorConexao;
import factory.FactoryDAO;

public class PessoaController {

    public Pessoa criarPessoa(String nome, String documento, String tipo) {

        Pessoa pessoa = null;

        if (tipo.equals("Pessoa Física")) {

            pessoa = new PessoaFisica(nome, documento);
        } else {

            pessoa = new PessoaJuridica(nome, documento);

        }

        FactoryDAO.makePessoaDAO().inserirPessoa(pessoa);

        return pessoa;
    }
}
