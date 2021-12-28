package com.lci.creditscore.repository;

import com.lci.creditscore.model.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CreditScoreRepo extends JpaRepository<CreditScore, String> {
}
