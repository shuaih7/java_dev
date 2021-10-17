package com.shuai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String sayHello(Model model){
        System.out.println("Connected to the controller.");
        model.addAttribute("msg", "Hello, SpringMVC.");

        return "hello";
    }
}
