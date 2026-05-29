package com.wipro.api_gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoggingController {

    @GetMapping("/debug/env")
    public Map<String, String> env(
            @Value("${FRONTEND_URL:NOT_SET}") String origin,
            @Value("${CUSTOMER_SERVICE_URL:NOT_SET}") String customerUrl
    ) {
        return Map.of("origin", origin, "customerUrl", customerUrl);
    }
}
