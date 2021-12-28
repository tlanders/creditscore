package com.lci.creditscore.controllers;

import com.lci.creditscore.model.CreditScore;
import com.lci.creditscore.repository.CreditScoreRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CreditScoreController {
    @Autowired
    private CreditScoreRepo creditScoreRepo;

    @GetMapping("/creditscores/{ssn}")
    public CreditScore getCreditScore(@PathVariable String ssn) {
        log.debug("getCreditScore - {}", ssn);
        return creditScoreRepo.findById(ssn).get();
    }
}
