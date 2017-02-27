package com.beginsamuel.thymeleaf;

import java.io.Serializable;

/**
 * Created by begin.samuel on 12/10/2016.
 */
public class Order implements Serializable {

    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    private ShoppingCart shoppingCart;

}
