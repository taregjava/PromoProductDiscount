package com.halfacode.PromoProduct.controller;

import com.halfacode.PromoProduct.dto.ProductRequest;
import com.halfacode.PromoProduct.dto.ProductType;
import com.halfacode.PromoProduct.service.ProductCatalog;
import com.halfacode.PromoProduct.startegy.PriceStrategy;
import com.halfacode.PromoProduct.utils.ProductsUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

@RestController
@RequestMapping("/api")
public class DataController {

    private final ProductCatalog productCatalog;

    public DataController(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @PostMapping("/processPrice")
    public ResponseEntity<String> proccessInputPrice(@RequestBody ProductRequest productRequest){
        try {
            ProductsUtils.validateInput(productRequest.getPrice());
            PriceStrategy priceStrategy=productCatalog.getPricingStrategy(productRequest.getProductType());
            Function<Double, Double > priceFunction= priceStrategy::applyPrice;

            double proccessDataPrice= ProductsUtils.proccessData(productRequest.getPrice(), priceFunction);

            return ResponseEntity.ok("Proccesed Price : " + proccessDataPrice);
        }catch (IllegalArgumentException e){
           return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error "+ e.getMessage());
        }
    }
}
