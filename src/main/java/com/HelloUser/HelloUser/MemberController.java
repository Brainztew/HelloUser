package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
        @GetMapping("/form")
        String getForm() {
            return "form";
        }

}
