package com.example.Training.Model;

import java.util.Date;

/**
 * Created by pana on 13/01/20.
 */
public class TrainingPricing {
    private Long pricingId;
    private double basePrice;
    private Date effectiveFrom;
    private Long batchId;
    private Date expiredOn;

    public TrainingPricing(double basePrice, Date effectiveFrom, Long batchId) {
        this.basePrice = basePrice;
        this.effectiveFrom = effectiveFrom;
        this.batchId = batchId;
    }

    public Long getPricingId() {
        return pricingId;
    }

    public void setPricingId(Long pricingId) {
        this.pricingId = pricingId;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Date getEffectiveFrom() {
        return effectiveFrom;
    }

    public void setEffectiveFrom(Date effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Date getExpiredOn() {
        return expiredOn;
    }

    public void setExpiredOn(Date expiredOn) {
        this.expiredOn = expiredOn;
    }
}
