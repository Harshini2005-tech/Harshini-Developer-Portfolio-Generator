package com.example.portfolio.repository;

import com.example.portfolio.model.UserPortfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PortfolioRepository extends JpaRepository<UserPortfolio, Long> {
    Optional<UserPortfolio> findByEmail(String email);
}