package com.exercicios.bancario.mock;

import java.util.List;

import com.exercicios.bancario.entity.Account;
import com.exercicios.bancario.entity.Client;

public class BankServiceImpl implements BankService {

	protected BankServiceImpl() { }
	
	@Override
	public List<Account> listAccounts() {
		return LoadEntities.ACCOUNTS;
	}

	@Override
	public List<Client> listClients() {
		return LoadEntities.CLIENTS;
	}
	
}
