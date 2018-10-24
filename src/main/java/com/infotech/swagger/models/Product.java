package com.infotech.swagger.models;

import java.util.UUID;

public class Product {
    private UUID id;
    private String userId;
    private String accountNumber;
    private String expiration;
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Product(UUID id, String userId, String accountNumber, String expiration,float balance) {
        this.id = id;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.expiration = expiration;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }
}
