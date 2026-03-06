package com.shruthi.jwtauth;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/profile")
    public ResponseEntity<?> profile(Authentication authentication) {

        Map<String, Object> response = new HashMap<>();
        response.put("username", authentication.getName());

        return ResponseEntity.ok(response);
    }
}