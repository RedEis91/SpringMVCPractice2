package com.userdate.controller;


public class Customer {
    private String customerID;
    private String companyName;
    private String city;

    public Customer(String cid, String cname, String cty) {
        this.customerID = cid;
        this.companyName = cname;
        this.city = cty;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Customer() {
        customerID = "";
        companyName = "";
        city = "";
    }


}
