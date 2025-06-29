package com.example.whatsappbot.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WhatsAppService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String phoneNumberId = "<YOUR_PHONE_NUMBER_ID>";
    private final String accessToken = "<YOUR_ACCESS_TOKEN>";

    public void sendMessage(String recipientNumber, String message) {
        String url = "Facebook url" + phoneNumberId + "/messages";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> payload = Map.of(
                "messaging_product", "whatsapp",
                "to", recipientNumber,
                "type", "text",
                "text", Map.of("body", message)
        );

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(payload, headers);
        restTemplate.postForEntity(url, request, String.class);
    }
}

