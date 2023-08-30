package DAO.postgres;

import Models.Pessoa;
import Models.PessoaFisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class PessoaDAOPostgres implements DAO.PessoaDAO {

    private final Connection conexao;

    public PessoaDAOPostgres(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void inserirPessoa(Pessoa pessoa) {

        try {
            String sql = "INSERT INTO pessoa(id, nome, documento, tipo) VALUES (?, ?, ?, CAST(? as tipo_pessoa))";

            String tipoPessoa = (pessoa instanceof PessoaFisica) ? "PF" : "PJ";
            
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, pessoa.getId());
            stm.setObject(2, pessoa.getNome());
            stm.setObject(3, pessoa.getDocumento());
            stm.setObject(4, tipoPessoa);
            
            stm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);

        }

    }

    @Override
    public Pessoa obterPessoaPeloId(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
