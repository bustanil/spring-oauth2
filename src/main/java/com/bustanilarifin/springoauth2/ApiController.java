package com.bustanilarifin.springoauth2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    ResponseEntity<?> hello() {
        return ResponseEntity.ok(Collections.singletonMap("message", "Hello world"));
    }

}
