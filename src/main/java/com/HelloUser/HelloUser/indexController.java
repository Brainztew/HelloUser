package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    
    @GetMapping("/")
    String getIndex() {
        System.out.println("index sida!");
        return "index";
    }
    
}
