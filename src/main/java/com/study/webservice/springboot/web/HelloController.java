package com.study.webservice.springboot.web;

import com.study.webservice.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam(value = "name", required = true) String name,
                                     @RequestParam(value = "amount", required = true) int amount) {

        return new HelloResponseDto(name, amount);
    }
}
