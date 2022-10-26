package com.osvaldevops.relearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class GitController {
    @GetMapping("/git")
    public String holaGit(@RequestParam(value="word",defaultValue = "World") String param){
        return "Hello " +param;
    }
    @Autowired
    RestTemplateBuilder builder;

    @GetMapping("/client-for-git")
    public String callToGit(){
        String url = "http://localhost:8080/git";
        RestTemplate restTemplate = builder.build();
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/client-for-countries")
    public List<Object> callToCountries(){
        String url = "https://restcountries.com/v3.1/all";
        RestTemplate restTemplate = new RestTemplate();
        Object[] countries = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(countries);
    }
}
