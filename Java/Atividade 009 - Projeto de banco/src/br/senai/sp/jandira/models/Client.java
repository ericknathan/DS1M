package br.senai.sp.jandira.models;

import java.time.LocalDate;

public class Client {

    private int codeID;
    private String name;
    private String email;
    private String phoneNumber;
    private double salary;
    private LocalDate birthDate;
    private Company company;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCodeID() { return codeID; }
    public void setCodeID(int codeID) { this.codeID = codeID; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }
}
