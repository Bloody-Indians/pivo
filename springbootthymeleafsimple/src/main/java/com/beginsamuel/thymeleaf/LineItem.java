package com.beginsamuel.thymeleaf;

import java.io.Serializable;
import java.util.List;

/**
 * Created by begin.samuel on 12/10/2016.
 */
public class LineItem  implements Serializable{



    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }



    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    private Product product;
    private  int Quantity;
    private  Double Price;
    private List<Location> locations;
}
