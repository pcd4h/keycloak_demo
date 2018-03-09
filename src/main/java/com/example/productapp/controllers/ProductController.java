package com.example.productapp.controllers;

import com.example.productapp.services.ProductService;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by dirk on 2018/03/07.
 **/
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    KeycloakRestTemplate template;

    @GetMapping(path = "/products")
    public String getProducts(Model model, Principal principal){
        ResponseEntity<String[]> response = template.getForEntity("http://localhost:8082/products", String[].class);
        model.addAttribute("products", response.getBody());

        //model.addAttribute("products", productService.getProducts());
        model.addAttribute("username", principal.getName());
        return "products";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }

}
