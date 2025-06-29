package com.example.whatsappbot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @GetMapping("/history/{userId}")
    public List<String> getHistory(@PathVariable String userId) {

        return List.of("Hi there!", "How can I help you?");
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String to, @RequestParam String message) {

        return "Message sent to " + to;
    }
}

