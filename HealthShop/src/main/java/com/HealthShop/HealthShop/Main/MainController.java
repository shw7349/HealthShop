package com.HealthShop.HealthShop.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String Main() {
        System.out.println("home controller start");

        return "index";
    }
    @GetMapping("/about")
    public String About() {
        System.out.println("home About start");

        return "about";
    }
}

