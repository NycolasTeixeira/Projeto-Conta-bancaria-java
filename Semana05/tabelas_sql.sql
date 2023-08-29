/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  nycolas_teixeira
 * Created: 28/08/2023
 */

CREATE TYPE tipo_pessoa as ENUM ('PF','PJ');

CREATE TABLE pessoa(
id UUID PRIMARY KEY NOT NULL,
nome VARCHAR(100) NOT NULL,
documento VARCHAR(18) NOT NULL UNIQUE,
tipo tipo_pessoa NOT NULL
);


select * from pessoa

CREATE TYPE tipo_conta as ENUM('corrente','salario','poupanca');
CREATE TABLE conta(
id UUID PRIMARY KEY NOT NULL,
	numero INTEGER NOT NULL UNIQUE,
	saldo DECIMAL(15,2) NOT NULL DEFAULT(0.0),
	tipo tipo_conta NOT NULL,
	pessoa_id UUID REFERENCES pessoa(id)
	
)