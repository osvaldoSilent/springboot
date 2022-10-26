package com.osvaldevops.relearn.util;

import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

public class CustomRestTemplateCustomizer implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {
        System.out.println("custom 1");
        restTemplate.getInterceptors().
                add(new CustomClientHttpRequestInterceptor());
    }
}
