/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import DAO.ContaDAO;
import DAO.PessoaDAO;
import DAO.postgres.ContaDAOPostgres;
import DAO.postgres.PessoaDAOPostgres;
import Util.GerenciadorConexao;
import java.sql.Connection;

/**
 *
 * @author nycolas_teixeira
 */
public class FactoryDAO {

    public static ContaDAO makeContaDAO() {
        return new ContaDAOPostgres(GerenciadorConexao.getConexao());
    }

    public static PessoaDAO makePessoaDAO() {
        Connection conexao = GerenciadorConexao.getConexao();
        PessoaDAOPostgres pessoaDao = new PessoaDAOPostgres(conexao);
        return pessoaDao;
    }

}
