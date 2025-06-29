package com.example.whatsappbot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @GetMapping
    public ResponseEntity<String> verifyWebhook(@RequestParam("hub.mode") String mode,
                                                @RequestParam("hub.verify_token") String verifyToken,
                                                @RequestParam("hub.challenge") String challenge) {
        if ("subscribe".equals(mode) && "YOUR_VERIFY_TOKEN".equals(verifyToken)) {
            return ResponseEntity.ok(challenge);
        }
        return ResponseEntity.status(403).body("Verification failed");
    }

    @PostMapping
    public ResponseEntity<Void> receiveMessage(@RequestBody Map<String, Object> payload) {
        System.out.println("Received Payload: " + payload);
        // You can trigger bot logic here based on payload
        return ResponseEntity.ok().build();
    }
}

