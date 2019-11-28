package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @Description TODO
 * @Author xu
 * @Date 2019/11/23 14:11
 **/
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "hello jenkins ¡ıÀ≥ haha  "+LocalDateTime.now().toString();
    }
}
