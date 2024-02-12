package com.halfacode.PromoProduct.startegy;

public class DiscountedPricingStrategy implements PriceStrategy{

    private final double DISCOUNT_PERCENTAGE= 0.15;

    @Override
    public double applyPrice(double originalPrice) {
        return originalPrice * (1 - DISCOUNT_PERCENTAGE);
    }
}
