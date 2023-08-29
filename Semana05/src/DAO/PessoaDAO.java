/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Pessoa;
import java.util.UUID;

/**
 *
 * @author nycolas_teixeira
 */
public interface PessoaDAO {
    public void inserirPessoa(Pessoa pessoa);
    public Pessoa obterPessoaPeloId(UUID id);
}
