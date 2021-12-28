package com.lci.creditscore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CreditScore {
    @Id
    private String ssn;
    private String firstName;
    private String lastName;
    private int score;
}
