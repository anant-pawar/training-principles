package com.training.OCP.good;

public class AirShipping implements Shipping {
    @Override
    public Double getShippingPrice() {
        return 100.0;
    }
}
