package com.dk.project.uber.uberApp.entities;

import com.dk.project.uber.uberApp.entities.enums.TransactionMethod;
import com.dk.project.uber.uberApp.entities.enums.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;
}
