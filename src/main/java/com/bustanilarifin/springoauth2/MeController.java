package com.bustanilarifin.springoauth2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Optional;

@RestController
public class MeController {

    private final AccountRepository accountRepository;

    public MeController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/api/me")
    public ResponseEntity<?> me(Principal principal) {
        String name = principal.getName();
        Optional<Account> account = accountRepository.findByUsername(name);
        if (account.isPresent()) {
            return ResponseEntity.ok(account.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
