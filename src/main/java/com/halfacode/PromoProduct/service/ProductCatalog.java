package com.halfacode.PromoProduct.service;

import com.halfacode.PromoProduct.dto.ProductRequest;
import com.halfacode.PromoProduct.dto.ProductType;
import com.halfacode.PromoProduct.startegy.DiscountedPricingStrategy;
import com.halfacode.PromoProduct.startegy.PriceStrategy;
import com.halfacode.PromoProduct.startegy.RegularPricingStrategy;
import org.springframework.stereotype.Service;

@Service
public class ProductCatalog {

    public PriceStrategy getPricingStrategy(ProductType productType){

        switch (productType){
            case REGULAR:
                return  new RegularPricingStrategy();
            case DISCOUNTED:
                return new DiscountedPricingStrategy();
            default:
                throw  new IllegalArgumentException("Unsupport product type");
        }
    }
}
