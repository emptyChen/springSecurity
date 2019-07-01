package com.example.springsecurityhellowold.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/role")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_HOME')")
    public String role(){
        return "role";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin/admin";
    }
}
