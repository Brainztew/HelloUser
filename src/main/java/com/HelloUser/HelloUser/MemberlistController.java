package com.HelloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberlistController {
    
    @GetMapping("/members")
    String getMembers() {
        return "members";
    }
}
