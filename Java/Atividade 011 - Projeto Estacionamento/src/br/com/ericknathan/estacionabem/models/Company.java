package br.com.ericknathan.estacionabem.models;

public class Company {

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyFancyName() {
        return companyFancyName;
    }

    public void setCompanyFancyName(String companyFancyName) {
        this.companyFancyName = companyFancyName;
    }

    private String cnpj;
    private String companyName;
    private String companyFancyName; // Nome da empresa

}
