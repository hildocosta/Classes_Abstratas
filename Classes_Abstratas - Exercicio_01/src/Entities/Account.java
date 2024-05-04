package Entities;

public abstract class Account {
	
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	
	// Metodo construtor padrao
	public Account() {
		
	}


	// Metodo construtor com argumentos
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	
	// Metodo Getters e Setters
	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}

	
	
	// Metodo Operacao para Saque 
	public void operacaoSaque(double amount) {
		balance -= amount + 5.0;
	}
	
	
	// Metodo Operacao para Deposito
	public void operacaoDeposito(double amount) {
		balance += amount;
	}

}
