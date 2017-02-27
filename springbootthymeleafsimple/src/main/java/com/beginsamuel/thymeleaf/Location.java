package com.beginsamuel.thymeleaf;

import java.io.Serializable;

/**
 * Created by begin.samuel on 12/10/2016.
 */
public class Location implements Serializable {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(Address serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    private String name;
    private Address shippingAddress;
    private Address serviceAddress;

    public ServiceContact getServiceContact() {
        return serviceContact;
    }

    public void setServiceContact(ServiceContact serviceContact) {
        this.serviceContact = serviceContact;
    }

    private ServiceContact serviceContact;
    private String address;




}
