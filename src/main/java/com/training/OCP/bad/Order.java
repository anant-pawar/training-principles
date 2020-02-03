package com.training.OCP.bad;

import java.util.List;

public class Order {
    private List<Product> products;
    private ShippingType shippingType;

    public void setShippingType(ShippingType shippingType){
        this.shippingType = shippingType;
    }

    public Double getShippingCost(){
        switch (shippingType){
            case Air:
                return 100.0;
            case Ground:
                return 50.0;
            default:
                return 0.0;
        }
    }
}
