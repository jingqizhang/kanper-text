package com.kanper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/text")
public class TestController {
    @RequestMapping("/index")
    public String test() {
        return "index";
    }
}