package com.beginsamuel.thymeleaf;

import java.io.Serializable;

/**
 * Created by begin.samuel on 12/10/2016.
 */
public class Product implements Serializable{


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String productId;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private String productName;


}
