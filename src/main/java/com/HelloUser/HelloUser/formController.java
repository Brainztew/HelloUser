package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formController {

    @GetMapping("/form")
        String getForm() {
        System.out.println("Formulär sida");
        return "form";
    }
}
