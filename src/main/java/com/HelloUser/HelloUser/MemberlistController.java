package com.HelloUser.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MemberlistController {
    private static final List<Member> members = new ArrayList<>();

    @GetMapping("/members")
    String getMembers(Model model) {
        model.addAttribute("members", members);
        model.addAttribute("newa", new Member(null, 0));
        System.out.println("Medlems sida!");
        return "members";
    }

    @PostMapping("/new-member")
    String newMember(Model model, @RequestParam String sourceText) {
        System.out.println("PostMapping " + sourceText);
        if (sourceText == "") {
            System.out.println("No postmapping");
        }
        else {
        members.add(new Member(sourceText, members.size()+ 1));
        }
        return "redirect:/form"; 
    }

    @GetMapping("/removeMember/{memberId}")
    String removeMember(@PathVariable int memberId) {
        System.out.println("Remove item" + memberId);
        members.removeIf(member -> member.getId() == memberId);
        return "redirect:/form";
    }


    @GetMapping("/form")
        String getForm(Model model) {
        model.addAttribute("members", members);
        model.addAttribute("newa", new Member(null, 0));
        System.out.println("Formulär sida");
        return "form";
        }
}


