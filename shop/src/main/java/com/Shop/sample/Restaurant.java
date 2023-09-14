package com.Shop.sample;

import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Restaurant {

    @Autowired
    private Chef chef;

}