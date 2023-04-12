package com.example.project97.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_name")
    private String cardHolderName;

    @Column(name = "card_expiry")
    private String expirationDate;

    @Column(name = "card_cvv")
    private String cvvCode;

    @Column(name = "card_amount")
    private BigDecimal amount;


    public Payment(String cardNumber, String cardHolderName, String expirationDate, String cvvCode, BigDecimal amount) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvvCode = cvvCode;
        this.amount = amount;
    }
    public Payment(){
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public String getCvvCode() {
        return cvvCode;
    }
    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
