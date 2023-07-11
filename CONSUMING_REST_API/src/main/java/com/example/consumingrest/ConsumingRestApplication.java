package com.example.consumingrest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
public class ClientService {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8081/greeting", String.class);
        System.out.println(result);
    }
}
}
