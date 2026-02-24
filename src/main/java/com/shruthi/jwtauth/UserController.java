package com.shruthi.jwtauth;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/profile")
    public ResponseEntity<?> profile(Authentication authentication) {

        String username = authentication.getName();

        return ResponseEntity.ok("Welcome " + username);
    }
}