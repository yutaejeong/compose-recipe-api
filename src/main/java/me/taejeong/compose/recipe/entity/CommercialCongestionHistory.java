package me.taejeong.compose.recipe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "commercial_congestion_histories")
public class CommercialCongestionHistory {
    @Id
    @Column(name = "time", nullable = false)
    private Instant id;

    @Column(name = "level")
    private Integer level;

    @Column(name = "payment_amount")
    private Integer paymentAmount;

    public Instant getId() {
        return id;
    }

    public void setId(Instant id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

}