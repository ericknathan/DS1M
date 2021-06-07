package br.com.ericknathan.estacionabem.models;

import br.com.ericknathan.estacionabem.enums.ClientType;

public class Client extends Person {

    private ClientType type; // Se o cliente é fidelizado
    private double monthlyValue;

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public double getMonthlyValue() {
        return monthlyValue;
    }

    public void setMonthlyValue(double monthlyValue) {
        this.monthlyValue = monthlyValue;
    }

}
