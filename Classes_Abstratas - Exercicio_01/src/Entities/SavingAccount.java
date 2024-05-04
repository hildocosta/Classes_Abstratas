package Entities;

public class SavingAccount  extends Account {
	
	private Double interestRate;
	
	
	// Metodo construtor padrao
	public SavingAccount() {
		
	}

   // Metodo construtor com argumentos
	public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	
	// Metodo Getters e Setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	
	
	// Metodo para atualizar o saldo com base na taxa de juros
	public void updateBalance () {
		balance += balance * interestRate;
		
	}
	
	
	// Metodo de Sobreposição
	@Override
	public void operacaoSaque(double amount) {
		balance -= amount;
	}
	
	
	
	
}
