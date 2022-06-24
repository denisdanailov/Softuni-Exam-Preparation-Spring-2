package com.example.coffeeshop_db.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String indexPage() {

        return "index";
    }

    @GetMapping("/home")
    public String loggedPage() {
        return "home";
    }
}
