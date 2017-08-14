package com.userdate.controller;


public class Customer {
    private String customerID;
    private String companyName;

    public Customer(String cid, String cname) {
        this.customerID = cid;
        this.companyName = cname;
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
    }


}
