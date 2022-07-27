package com.exercicios.bancario.exercicios;

import java.util.List;

import com.exercicios.bancario.entity.Account;
import com.exercicios.bancario.entity.Client;
import com.exercicios.bancario.mock.BankService;
import com.exercicios.bancario.mock.ServiceFactory;

/**
 * OBSERVAÇÕES: 
 * NÃO é permitido o uso de nenhuma estrutura de repetição (for, while, do-while).
 * Tente, ao máximo, evitar o uso das estruturas if, else if, else e switch-case
 * 
 * @author Bruno Konzen Stahl
 * @author Victor Lira
 */
public class Exercicios {

	private static BankService service = ServiceFactory.getService();

	/**
	 * Exemplos de chamadas para cada método da lista de exercícios
	 * Executar apenas um por vez
	 */
	public static void main(String[] args) {

		imprimirNomesClientes();
		//imprimirMediaSaldos();
		//imprimirPaisClienteMaisRico();
		//imprimirSaldoMedio(1);
		//imprimirClientesComPoupanca();
		//getEstadoClientes(1);
		//getNumerosContas("Brazil");
		//getMaiorSaldo("client4@bank.com");
		//sacar(1, 1, 50);
		//depositar("Brazil",50);
		//transferir(1, 1, 1, 50); 
		//getContasConjuntas();
		//getSomaContasEstado("1");
		//getEmailsClientesContasConjuntas();
		//isPrimo(40);
		//getFatorial(9);
	}

	/**
	 * 1. Imprima na tela o nome e e-mail de todos os clientes (sem repetição), usando o seguinte formato:
	 * Victor Lira - vl@cin.ufpe.br
	 */
	public static void imprimirNomesClientes() {
		
	}

	/**
	 * 2. Imprima na tela o nome do cliente e a média do saldo de suas contas, ex:
	 * Victor Lira - 352
	 */
	public static void imprimirMediaSaldos() {
		
	}

	/**
	 * 3. Considerando que só existem os países "Brazil" e "United States", 
	 * imprima na tela qual deles possui o cliente mais rico, ou seja,
	 * com o maior saldo somando todas as suas contas.
	 */
	public static void imprimirPaisClienteMaisRico() {

	}

	/**
	 * 4. Imprime na tela o saldo médio das contas da agência
	 * @param agency
	 */
	public static void imprimirSaldoMedio(int agency) {	
	
	}

	/**
	 * 5. Imprime na tela o nome de todos os clientes que possuem conta poupança (tipo SAVING)
	 */
	public static void imprimirClientesComPoupanca() {
		
	}

	/**
	 * 6.
	 * @param agency
	 * @return Retorna uma lista de Strings com o "estado" de todos os clientes da agência
	 */
	public static List<String> getEstadoClientes(int agency) {
		List<String> stateOfAllClients =  null;
		return (List<String>) stateOfAllClients;
	}

	/**
	 * 7.
	 * @param country
	 * @return Retorna uma lista de inteiros com os números das contas daquele país
	 */
	public static int[] getNumerosContas(String country) {
		int [] countryNumbers = null;
		return (int[]) countryNumbers;
	}

	/**
	 * 8.
	 * Retorna o somatório dos saldos das contas do cliente em questão 
	 * @param clientEmail
	 * @return
	 */
	public static double getMaiorSaldo(String clientEmail) {
		double sumBalance = 0;
		return sumBalance;
	}

	/**
	 * 9.
	 * Realiza uma operação de saque na conta de acordo com os parâmetros recebidos
	 * @param agency
	 * @param number
	 * @param value
	 */
	public static void sacar(int agency, int number, double value) {
		
	}

	/**
	 * 10. Realiza um deposito para todos os clientes do país em questão	
	 * @param country
	 * @param value
	 */
	public static void depositar(String country, double value) {

	}

	/**
	 * 11. Realiza uma transferência entre duas contas de uma agência.
	 * @param agency - agência das duas contas
	 * @param numberSource - conta a ser debitado o dinheiro
	 * @param numberTarget - conta a ser creditado o dinheiro
	 * @param value - valor da transferência
	 */
	public static void transferir(int agency, int numberSource, int numberTarget, double value) {
		
	}

	/**
	 * 12.
	 * @param clients
	 * @return Retorna uma lista com todas as contas conjuntas (JOINT) dos clientes
	 */
	public static List<Account> getContasConjuntas(List<Client> clients) {
		List<Account> jointAccounts = null;
		return jointAccounts;
	}

	/**
	 * 13.
	 * @param state
	 * @return Retorna uma lista com o somatório dos saldos de todas as contas do estado 
	 */
	public static double getSomaContasEstado(String state) {
		double sumAccountState = 0;
		return sumAccountState;
	}

	/**
	 * 14.
	 * @return Retorna um array com os e-mails de todos os clientes que possuem contas conjuntas
	 */
	public static String[] getEmailsClientesContasConjuntas() {
		List<String> emailsAllClientsJoinAccounts = null;
		return (String []) emailsAllClientsJoinAccounts.toArray();

	}

	/**
	 * 15.
	 * @param number
	 * @return Retorna se o número é primo ou não
	 */
	public static boolean isPrimo(int number) {
		return true;
	}

	/**
	 * 16.
	 * @param number
	 * @return Retorna o fatorial do número
	 */
	public static int getFatorial(int number) {
		int factorial =	0;
		return factorial;
	}
}
