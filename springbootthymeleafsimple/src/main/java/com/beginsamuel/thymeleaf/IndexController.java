package com.beginsamuel.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @RequestMapping("/simplename")
    public String index(Model model, @RequestParam(value="name", required=false, defaultValue=" Senthil, please work on Order method") String name) {
        model.addAttribute("name", name);
        return "index";
    }


    @RequestMapping("/order")  // Senthil you may  work on here. (
    // I have done 99% task to display order code and tested.. check with deepak and anything else we need to do, else skip it
    public String order(Model model) {

        Order order = getMyOrder();

        model.addAttribute("order", order);

        return "order";
    }


    private Order getMyOrder(){
        Order order = new Order();
        order.setId("ORD1234");
        order.setTitle("SDWAN-BASIC Order Placed");


        // Shopping Cart
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartId("CART123");


        // Set Line Items
        List<LineItem> lineItems = new ArrayList<LineItem>();

         // Create Line Item
             LineItem lineItem = new LineItem();
                 lineItem.setPrice(200.00);
                 lineItem.setQuantity(2);
                 // set Product
                 Product product = new Product();
                     product.setProductId("SDWAN BASIC");
                     product.setProductName("SDWAN BASIC");
                  lineItem.setProduct(product);

                  // Set Locations;
                  List<Location> locations = new ArrayList<Location>();
                     // create Location
                     Location location = new Location();
                     location.setName("HCL ETA");
                     location.setAddress("Navalur");

                       // Create Service Contact
                         ServiceContact  contact1 = new ServiceContact();
                          contact1.setFirstName("Senthil");
                          contact1.setLastName("Muthusamy");
                          contact1.setEmail("senthil@gmail.com");
                          contact1.setPhoneNumber("12222");
                           location.setServiceContact(contact1);
                       // Create Service Address
                             Address serviceAddress1 = new Address();
                             serviceAddress1.setLocationName("ETA 3");
                             serviceAddress1.setAddressLine("Address line 1");
                             serviceAddress1.setAddressDetails("Address details 1");
                             location.setServiceAddress(serviceAddress1);
                       // Create Shipping Address
                                            Address shippingAddress1 = new Address();
                                            shippingAddress1.setLocationName("ETA 3 Shipping");
                                            shippingAddress1.setAddressLine("Address line 1");
                                            shippingAddress1.setAddressDetails("Address details 1");
                                            location.setShippingAddress(shippingAddress1);

                     locations.add(location);

                    // create Location 2
                    Location location2 = new Location();
                    location2.setName("HCL Madurai");
                    location2.setAddress("Madurai");
        // Create Service Contact
        ServiceContact  contact2 = new ServiceContact();
        contact2.setFirstName("Hari");
        contact2.setLastName("venlatesh");
        contact2.setEmail("hari@gmail.com");
        contact2.setPhoneNumber("12223");
        location2.setServiceContact(contact2);
        // Create Service Address
        Address serviceAddress2 = new Address();
        serviceAddress2.setLocationName("ETA 2");
        serviceAddress2.setAddressLine("Address line 2");
        serviceAddress2.setAddressDetails("Address details 2");
        location2.setServiceAddress(serviceAddress2);
        // Create Shipping Address
        Address shippingAddress2 = new Address();
        shippingAddress2.setLocationName("ETA 3 Shipping 2");
        shippingAddress2.setAddressLine("Address line 2");
        shippingAddress2.setAddressDetails("Address details 2");
        location2.setShippingAddress(shippingAddress2);

                            locations.add(location2);


        lineItem.setLocations(locations);
        lineItems.add(lineItem);


        shoppingCart.setLineItems(lineItems);
        order.setShoppingCart(shoppingCart);

        return order;
    }


}
