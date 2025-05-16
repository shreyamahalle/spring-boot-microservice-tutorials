package com.shreya.twelvefactorapp.service;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String process() {
        return "Processed by service";
    }
}