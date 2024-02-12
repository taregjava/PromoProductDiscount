package com.halfacode.PromoProduct.utils;

import java.util.function.Function;

public class ProductsUtils {

    public static  double proccessData(double input, Function<Double,Double>dataProccessed){
        return  dataProccessed.apply(input);
    }

    public static void validateInput(double price){
        if(price < 0){
            throw new  IllegalArgumentException("price mist be non negative value ");
        }
    }
}
