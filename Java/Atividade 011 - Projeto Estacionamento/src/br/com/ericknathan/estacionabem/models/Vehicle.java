package br.com.ericknathan.estacionabem.models;

import br.com.ericknathan.estacionabem.enums.VehicleType;

public class Vehicle {

    private String licensePlate; // Placa do veículo
    private String model; // Nome do modelo
    private String color;
    private VehicleType vehicleType;
    private Client client;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
