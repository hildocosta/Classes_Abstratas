package Program;

import java.util.ArrayList;
import java.util.List;

import Entities.Account;
import Entities.BusinnessAccount;
import Entities.SavingAccount;

public class Main {

    public static void main(String[] args) {
        
        // Criando uma lista para armazenar objetos da classe Account
        List<Account> list = new ArrayList<>();
        
        // Adicionando diferentes tipos de contas à lista
        list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinnessAccount(1002,"Maria", 1000.0, 400.0));
        list.add(new SavingAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinnessAccount(1005, "Anna", 500.0, 500.0));
        
        // Calculando o saldo total de todas as contas na lista
        double soma = 0.0;
        for(Account acc : list) {
            soma += acc.getBalance();
        }
        
        // Imprimindo o saldo total
        System.out.printf(" Total balance: %.2f%n", soma);
        
        // Realizando operações de depósito em todas as contas na lista
        for(Account acc : list) {
            acc.operacaoDeposito(10.0);
        }
        
        // Imprimindo o saldo atualizado de cada conta na lista
        for(Account acc : list) {
            System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance() );
        }

    }

}
