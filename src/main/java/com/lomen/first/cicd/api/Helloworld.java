package com.lomen.first.cicd.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Hello World!";
    }
}
