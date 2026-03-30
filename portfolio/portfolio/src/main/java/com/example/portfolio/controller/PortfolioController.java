package com.example.portfolio.controller;

import com.example.portfolio.model.UserPortfolio;
import com.example.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PortfolioController {

    @Autowired
    private PortfolioRepository repo;

    @PostMapping("/create")
    public UserPortfolio createAccount(@RequestBody UserPortfolio data) {
        return repo.save(data);
    }

    @GetMapping("/portfolio/{email}")
    public UserPortfolio getPortfolio(@PathVariable String email) {
        return repo.findByEmail(email).orElse(null);
    }
}
