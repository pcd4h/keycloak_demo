package com.example.productapp.services;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dirk on 2018/03/07.
 **/
@Component
public class ProductService {

    public List<String> getProducts() {
        return Arrays.asList("iPad", "iPod", "iPhone");
    }

}
