package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String hello() {
        return "테스트 끝!";
    }
    @GetMapping("/a")
    public String hello2() {
        return "진짜 끝";
    }
}
