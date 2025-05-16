package com.shreya.twelvefactorapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {
    @GetMapping("/log")
    public String logDemo() {
        log.info("This is a sample log message.");
        return "Log printed!";
    }
}