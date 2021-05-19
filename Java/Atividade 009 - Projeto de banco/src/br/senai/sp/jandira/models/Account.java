package br.senai.sp.jandira.models;

import java.time.LocalDate;

public class Account {

    private String accountNumber;
    private String agency;
    private Client client;
    private double balance = 0;
    private String  bankName;
    private LocalDate openDate;

    /* METHODS */
    public Account(Client client) {
        this.client = client;
        System.out.printf("A conta do cliente %s foi criada com o saldo de R$0.0\n", client.getName());
    }

    public Account(Client client, double balanceValue) {
        this.client = client;
        this.balance = balanceValue;
        String value = Double.toString(balanceValue).replace(".", ",").split(",")[1].length() == 1 ? Double.toString(balanceValue).replace(".", ",") + "0" : Double.toString(balanceValue).replace(".", ",");
        System.out.printf("A conta do cliente %s foi criada com o saldo de R$%s\n", client.getName(), value);
    }

    public Account() {
        System.out.println("Conta vazia criada!");
    }

    /* ACTIONS */
    public void depositMoney(double value) {
        if(value < 0) {
            System.out.printf("%s, a quantia informada é de R$%s e seu saldo é de R$%s, não é possível depositar um valor negativo.\n", client.getName(), value, balance);
        } else {
            balance += value;
            System.out.printf("O cliente %s, depositou um valor de R$%s. Valor total: R$%s\n", client.getName(), value, balance);
        }
    }

    public boolean withdrawMoney(double value) {
        if(balance <= 0 && balance <= value) {
            System.out.printf("%s, a quantia informada é de R$%s e seu saldo é de R$%s, não é possível realizar a ação de saque.\n", client.getName(), value, balance);
            return false;
        } else if(value <= 0) {
            System.out.printf("%s, não é possível sacar uma quantida negativa!\n", client.getName());
            return false;
        } else {
            balance -= value;
            System.out.printf("O cliente %s, sacou um valor de R$%s. Valor total: R$%s\n", client.getName(), value, balance);
            return true;
        }
    }

    public void transferMoney(Account toAccount, double value) {
        if(this.withdrawMoney(value)) {
            toAccount.depositMoney(value);
        } else {
            System.out.printf("Não foi possível fazer uma transferencia de R$%s para a conta do cliente %s, pois você não possúi saldo suficiênte.\n", value, toAccount.getClient().getName());
        }
    }

    /* GETTER'S AND SETTER'S */
    public void setBalance(double balanceValue) { this.balance = balanceValue; }
    public double getBalance() { return this.balance; }

    public void setAccountNumber(String account) {
        if(account.length() > 5) {
            this.accountNumber = account;
        } else {
            System.out.println("O número da conta deve possuir no mínimo 5 caracteres!");
        }
    }
    public String getAccount() { return this.accountNumber; }

    public void setAgency(String agency) { this.agency = agency; }
    public String getAgency() { return this.agency; }

    public void setBank(String bank) { this.bankName = bank; }
    public String getBank() { return this.bankName; }

    public Client getClient() { return this.client; }

    public LocalDate getOpenDate() { return openDate; }
    public void setOpenDate(LocalDate openDate) { this.openDate = openDate; }
}
