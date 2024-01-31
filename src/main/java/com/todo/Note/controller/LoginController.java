package com.todo.Note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
//        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
//        Authentication authentication = authenticationManager.authenticate(token);
//
//        if (authentication.isAuthenticated()) {
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            return "redirect:/dashboard";
//        } else {
//            redirectAttributes.addFlashAttribute("error", "Invalid User");
//            return "redirect:/login";
//        }
//    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.html sayfasını döndürür
    }
}
