package com.example.Training.Model;

import java.util.Date;

/**
 * Created by pana on 13/01/20.
 */
public class FacilityPricing {
    private Long pricingId;
    private double basePrice;
    private Date effectiveFrom;
    private Long facilityId;
    private Date expiredOn;


    public FacilityPricing(double basePrice, Date effectiveFrom, Long facilityId) {
        this.basePrice = basePrice;
        this.effectiveFrom = effectiveFrom;
        this.facilityId = facilityId;
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

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Date getExpiredOn() {
        return expiredOn;
    }

    public void setExpiredOn(Date expiredOn) {
        this.expiredOn = expiredOn;
    }
}
