package br.com.ericknathan.estacionabem;

import br.com.ericknathan.estacionabem.enums.ClientType;
import br.com.ericknathan.estacionabem.enums.VehicleType;
import br.com.ericknathan.estacionabem.models.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        System.out.println("Aplicação iniciada com sucesso!");

        Client pedro = new Client();

        pedro.setPhoneNumber("(11)78451-8956");
        pedro.setEmail("pedro.santos@uol.com.br");
        pedro.setMonthlyValue(200);
        pedro.setType(ClientType.MONTLHY);
        pedro.setRg("12.562.658-25");
        pedro.setName("Pedro dos Santos Monteiro");

        Employee joao = new Employee();
        joao.setName("João da Silva");
        joao.setAdmissionDate(LocalDate.of(2019, 9, 28));
        joao.setFunction("Atendente");

        Vacancy vacancyOne = new Vacancy();
        vacancyOne.setNumber("A-100");
        vacancyOne.setOccupied(false);
        vacancyOne.setToleranceTime(LocalTime.of(0, 15, 0));
        vacancyOne.setVacancyType(VehicleType.PASSENGER);
        vacancyOne.setValuePerHour(20.0);
        vacancyOne.setValuePerAddHour(12.0);

        Vehicle vehicleOne = new Vehicle();
        vehicleOne.setClient(pedro);
        vehicleOne.setColor("Azul");
        vehicleOne.setModel("Monza");
        vehicleOne.setLicensePlate("ABC4512");
        vehicleOne.setVehicleType(VehicleType.PASSENGER);

        Action actionOne = new Action();
        actionOne.setEntryDate(LocalDate.now());
        actionOne.setEntryHour(LocalTime.of(9, 27));
        actionOne.setEmployee(joao);
        actionOne.setVacancy(vacancyOne);
        actionOne.setVehicle(vehicleOne);
        /*
         * actionOne.setPrice();
         * actionOne.setDepartureDate(LocalDate.of());
         * actionOne.setDepartureHour(LocalTime.of);
         */

    }
}