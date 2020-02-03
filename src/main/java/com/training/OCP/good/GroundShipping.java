package com.training.OCP.good;

public class GroundShipping implements Shipping {
    @Override
    public Double getShippingPrice() {
        return 50.0;
    }
}
