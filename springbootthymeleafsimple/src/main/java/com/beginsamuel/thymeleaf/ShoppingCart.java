package com.beginsamuel.thymeleaf;

import java.io.Serializable;
import java.util.List;

/**
 * Created by begin.samuel on 12/10/2016.
 */
public class ShoppingCart implements Serializable{

    private String cartId;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    private List<LineItem> lineItems;

}
