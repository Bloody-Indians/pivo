package com.beginsamuel.thymeleaf;

import java.io.Serializable;

/**
 * Created by begin.samuel on 12/10/2016.
 */
public class Address implements Serializable {


    private String locationName;
    private String addressLine;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    private String addressDetails;

}
