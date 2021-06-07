package br.com.ericknathan.estacionabem.models;

import br.com.ericknathan.estacionabem.enums.VehicleType;

import java.time.LocalTime;

public class Vacancy {

    private String number;
    private VehicleType vehicleType; // MOTORCYCLE, PASSENGER, UTILITARY
    private boolean occupied; // Ocupada: true && Livre: false
    private double valuePerHour;
    private double valuePerAddHour;
    private LocalTime toleranceTime;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getVacancyType() {
        return vehicleType;
    }

    public void setVacancyType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double getValuePerAddHour() {
        return valuePerAddHour;
    }

    public void setValuePerAddHour(double valuePerAddHour) {
        this.valuePerAddHour = valuePerAddHour;
    }

    public LocalTime getToleranceTime() {
        return toleranceTime;
    }

    public void setToleranceTime(LocalTime toleranceTime) {
        this.toleranceTime = toleranceTime;
    }

}
