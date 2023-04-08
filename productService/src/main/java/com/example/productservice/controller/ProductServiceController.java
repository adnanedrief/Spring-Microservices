package com.example.productservice.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductServiceController {
    @Value("${me}")
    private String me;
    @GetMapping(value="/messages")
    public String message() {
        System.out.println("value of me is : " + me);
        log.info("value of me is : " + me);
        return me;
    }
}

