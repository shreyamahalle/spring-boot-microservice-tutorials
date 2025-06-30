package com.shreya.microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/charge")
    public ResponseEntity<String> charge(@RequestParam Double amount, @RequestParam String userId) {
        // Simulated charge; integrate real payment gateway (Stripe, PayPal) here
        return ResponseEntity.ok("Charged ₹" + amount + " for user " + userId);
    }
}
