package com.halfacode.PromoProduct.startegy;

public class RegularPricingStrategy implements PriceStrategy{
    @Override
    public double applyPrice(double originalPrice) {
        return originalPrice;
    }
}
