package com.example.Training.Model;

/**
 * Created by pana on 13/01/20.
 */
public class TrainingBooking {
    private Long batchId;
    private Long bookingUserId;
    private Long receiptId;

    public TrainingBooking(Long batchId, Long bookingUserId) {
        this.batchId = batchId;
        this.bookingUserId = bookingUserId;

        //TODO check if max participants already reached
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getBookingUserId() {
        return bookingUserId;
    }

    public void setBookingUserId(Long bookingUserId) {
        this.bookingUserId = bookingUserId;
    }

    public Long getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }

}
