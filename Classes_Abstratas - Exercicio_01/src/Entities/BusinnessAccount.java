package Entities;

public class BusinnessAccount extends Account {

    private Double loanLimit;

    // Construtor padrão
    public BusinnessAccount() {
        super();
    }

    // Construtor com argumentos
    public BusinnessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // Getters e Setters
    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // Método para operação de empréstimo
    public void operacaoEmprestimo(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    // Sobrescrita do método operacaoSaque
    @Override
    public void operacaoSaque(double amount) {
       super.operacaoSaque(amount);
       balance -= 2.0;
    }
    
    
}
