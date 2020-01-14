package com.example.Training.Model;

import java.util.Date;

/**
 * Created by pana on 13/01/20.
 */
public class FacilityBooking {
    private Long facilityId;
    private Long bookingUserId;
    private Date startTime;
    private Date endTime;
    private Long receiptId;

    public Long getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Long getBookingUserId() {
        return bookingUserId;
    }

    public void setBookingUserId(Long bookingUserId) {
        this.bookingUserId = bookingUserId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public FacilityBooking(Long facilityId, Long bookingUserId, Date startTime, Date endTime) {
        this.facilityId = facilityId;
        this.bookingUserId = bookingUserId;
        this.startTime = startTime;
        this.endTime = endTime;

        //TODO validate is facility is available for booking
    }


}
