package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LingChuan
 * @date 2018/5/18
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String hello(){
        return "Hello,World!";
    }
}
