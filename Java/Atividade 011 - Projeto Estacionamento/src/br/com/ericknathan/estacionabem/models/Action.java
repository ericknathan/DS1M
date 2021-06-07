package br.com.ericknathan.estacionabem.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Action {

    private LocalDate entryDate;
    private LocalTime entryHour;
    private Employee employee;
    private Vacancy vacancy; // Vaga em que o veículo estacionou
    private Vehicle vehicle;
    private LocalDate departureDate;
    private LocalTime departureHour;
    private double price;

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalTime getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(LocalTime entryHour) {
        this.entryHour = entryHour;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(LocalTime departureHour) {
        this.departureHour = departureHour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
