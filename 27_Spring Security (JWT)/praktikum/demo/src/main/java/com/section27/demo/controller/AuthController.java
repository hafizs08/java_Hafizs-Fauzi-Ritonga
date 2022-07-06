package com.section27.demo.controller;

import com.section27.demo.entity.UsernamePassword;
import com.section27.demo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/v2/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping(value = "/register")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
        authService.register(req);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/info")
    public ResponseEntity<?> generatePhone(HttpServletRequest request){
        return ResponseEntity.ok(authService.generatePhone(request));
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword req){
        return ResponseEntity.ok(authService.generateToken(req));
    } 
}
