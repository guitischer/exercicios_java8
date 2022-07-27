package com.exercicios.bancario.mock;

import java.util.List;

import com.exercicios.bancario.entity.Account;
import com.exercicios.bancario.entity.Client;

public interface BankService {
	public List<Account> listAccounts();
	public List<Client> listClients();
}
