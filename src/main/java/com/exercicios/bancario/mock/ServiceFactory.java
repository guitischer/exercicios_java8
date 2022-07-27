package com.exercicios.bancario.mock;

public class ServiceFactory {

	public static BankService getService() {
		return new BankServiceImpl();
	}
}
