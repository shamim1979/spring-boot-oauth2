package org.example.utility.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("division")
public class DivisionController {

    @GetMapping
    //@PreAuthorize("hasRole('ADMIN')")
    public String division(@AuthenticationPrincipal Jwt jwt) {
        return "dhaka";
    }
}
