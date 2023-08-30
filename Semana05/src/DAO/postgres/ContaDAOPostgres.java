package DAO.postgres;

import DAO.ContaDAO;
import Models.Conta;
import Models.ContaCorrente;
import Models.ContaSalario;
import Models.Pessoa;
import Models.PessoaFisica;
import Models.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ContaDAOPostgres implements ContaDAO {

    private final Connection conexao;

    public ContaDAOPostgres(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void inserirConta(Conta conta) {

        String sql = "INSERT INTO conta (id, numero, saldo, tipo, pessoa_id) VALUES (?,?,?, CAST (? as tipo_conta), ?)";
        String tipoConta = (conta instanceof ContaCorrente) ? "corrente" : (conta instanceof ContaSalario) ? "salario" : "poupanca";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, conta.getId());
            stm.setInt(2, conta.getNumero());
            stm.setDouble(3, conta.getSaldo());
            stm.setString(4, tipoConta);
            stm.setObject(5, conta.getTitular().getId());

            stm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    @Override
    public Conta buscarContaPorDocTitular(String documento) {
        String sql = "SELECT c.id, c.numero,c.saldo, c.tipo, c.pessoa_id, p.nome, p.tipo AS pessoa_tipo FROM conta AS c"
                + " JOIN pessoa AS p ON c.pessoa_id = p.id WHERE p.documento = ?";
        try {

            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setString(1, documento);

            ResultSet resultado = stm.executeQuery();

            if (resultado.next()) {
                UUID id = resultado.getObject("pessoa_id", UUID.class);
                String nome = resultado.getString("nome");
                String tipo = resultado.getString("tipo");

                Pessoa pessoa;
                if (tipo.equals("PF")) {
                    pessoa = new PessoaFisica(id, nome, documento);
                } else {
                    pessoa = new PessoaJuridica(id, nome, documento);
                }
                
                UUID idConta = resultado.getObject("id", UUID.class);
                int numero = resultado.getInt("numero");
                double saldo = resultado.getDouble("saldo");
                String tipoC = resultado.getString("tipo");

                if (tipoC.equals("corrente")) {
                    return new ContaCorrente(numero, saldo, pessoa, idConta);
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }

        return null;
    }
}
