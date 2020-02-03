package com.training.OCP.good;

import java.util.List;

public class Order {
    private List<Product> products;
    private Shipping shipping;

    public Double getTotal(){
        return 0.0;
    }

    public void setShippingType(Shipping shipping){
        this.shipping = shipping;
    }

    public Double getShippingCost(){
        return shipping.getShippingPrice();
    }
}
