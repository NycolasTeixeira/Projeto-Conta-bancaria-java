/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Conta;

/**
 *
 * @author nycolas_teixeira
 */
public interface ContaDAO {
    

public void inserirConta(Conta conta);
public Conta buscarContaPorDocTitular(String documento);
public void atualizaSaldo(Conta conta);




}
