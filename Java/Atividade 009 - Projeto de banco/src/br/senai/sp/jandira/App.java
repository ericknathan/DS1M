package br.senai.sp.jandira;

import br.senai.sp.jandira.models.Account;
import br.senai.sp.jandira.models.Client;
import br.senai.sp.jandira.models.Company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Company senai = new Company();
        senai.setName("SENAI Prof. Vicente Amato");
        senai.setPhoneNumber("(11) 4770-4700");
        senai.setCity("Jandira");

        Client clientOne = new Client();
        clientOne.setCodeID(125);
        clientOne.setName("Fernando Leonid");
        clientOne.setBirthDate(LocalDate.of(1950, 6, 29));
        clientOne.setEmail("fernandoleonid@terra.com.br");
        clientOne.setPhoneNumber("(11) 978459-5623");
        clientOne.setSalary(2000);
        clientOne.setCompany(senai);

        Client clientTwo = new Client();
        clientTwo.setCodeID(200);
        clientTwo.setName("Luiz Antonio");
        clientTwo.setBirthDate(LocalDate.of(1980, 8, 21));
        clientTwo.setEmail("luiz@terra.com.br");
        clientTwo.setCompany(senai);
        clientTwo.setSalary(3000);
        clientTwo.setPhoneNumber("(11) 1245-8956");

        System.out.println("\n***********CRIANDO***********");

        Account accountOne = new Account(clientOne, 350);
        accountOne.setAccountNumber("45785-8");
        accountOne.setAgency("0002");
        accountOne.setBank("Bradesco");
        accountOne.setOpenDate(LocalDate.of(2021, 5, 10));

        Account accountTwo = new Account(clientTwo, 100);
        accountTwo.setAgency("5623-5");
        accountTwo.setBank("Itaú");
        accountTwo.setOpenDate(LocalDate.now());
        accountTwo.setAccountNumber("5614215-0");

        System.out.println("\n***********EXTRATOS***********");
        showExtract(accountOne);
        showExtract(accountTwo);

        System.out.println("\n**********TRANSAÇÕES**********");
        accountOne.transferMoney(accountTwo, -50);

        showExtract(accountOne);
        showExtract(accountTwo);
    }

    public static void showExtract(Account account) {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\nTitular: " + account.getClient().getName()
                + "\nE-mail: "+ account.getClient().getEmail()
                + "\nEmpresa: " + account.getClient().getCompany().getName()
                + "\nTelefone do Cliente: " + account.getClient().getPhoneNumber()
                + "\nTelefone da Empresa: " + account.getClient().getCompany().getPhoneNumber()
                + "\nConta: " + account.getAccount()
                + "\nSaldo: " + account.getBalance()
                + "\nAgência: " + account.getAgency()
                + "\nBanco: " + account.getBank()
                + "\nData de abertura: " + formatDate.format(account.getOpenDate()));
    }

}
