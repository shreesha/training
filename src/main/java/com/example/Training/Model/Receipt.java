package com.example.Training.Model;

import java.util.Date;

/**
 * Created by pana on 13/01/20.
 */
public class Receipt {
    private Long receiptNumber;
    private double totalAmount;
    private Date receiptDate;
    private Long receiptFor;

    public Receipt(double totalAmount, Date receiptDate, Long receiptFor) {
        this.totalAmount = totalAmount;
        this.receiptDate = receiptDate;
        this.receiptFor = receiptFor;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Long getReceiptFor() {
        return receiptFor;
    }

    public void setReceiptFor(Long receiptFor) {
        this.receiptFor = receiptFor;
    }

    public Long getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(Long receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
}
