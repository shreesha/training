package com.example.Training.Service;

import com.example.Training.Model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * Created by pana on 13/01/20.
 */
public class OrganizationService {
    @Autowired
    private Batch batch;
    public TrainingBooking bookTraining(Long batchId, Long bookingUserId){
        TrainingBooking newBooking = new TrainingBooking(batchId, bookingUserId);

        //
        double priceObj = getPricingForTraining(batchId);
        newBooking.setReceiptId(new Receipt(priceObj, new Date(),bookingUserId).getReceiptNumber());
        return newBooking;

    }

    public FacilityBooking bookAFacility(Long facilityId, Long bookingUserId, Date startTime, Date endTime){
        FacilityBooking newBooking = new FacilityBooking(facilityId, bookingUserId, startTime, endTime);

        //On booking, create a new Receipt
        //First calculate total cost based on total hours

        //Get latest pricing for the facility
        double pricingObj = getPricingForFacility(facilityId);

        newBooking.setReceiptId(new Receipt(pricingObj, new Date(),bookingUserId).getReceiptNumber());

        return newBooking;

    }

    private double getPricingForFacility(Long facilityId) {
        //FacilityPricing newFacilityPricing = new FacilityPricing()
        return 125;
    }

    private double getPricingForTraining(Long batchNumber) {
        //FacilityPricing newFacilityPricing = new FacilityPricing()
        return 200;
    }

    public Facility addFacility(String type, Boolean isAvailable, double basePrice, String description, Date effectiveDateOfPrice){
        Facility newFacility = new Facility(type, isAvailable, description);

        FacilityPricing newPricing = new FacilityPricing(basePrice, effectiveDateOfPrice, newFacility.getFacilityId());
        return newFacility;
    }

    public Training addTraining(String description, String type, Boolean isActive){
        return new Training(description, type, isActive);

    }


    public Batch createNewBatch(Date startDate, Date endDate, int maxParticipants
                                ){
        Batch newBatch = new Batch(startDate, endDate, maxParticipants);
        //TrainingPricing newPricing = new TrainingPricing(basePrice, effectiveDateOfPrice, this.batch.getBatchNumber());

        return  newBatch;
    }

    public Receipt getReceiptForBooking(Long bookingId){
        return new Receipt(200, new Date(), new Long(123123123));
        //return getReceiptForBookingFromDb(bookingId);
    }

    public List<FacilityBooking> getFacilityBookingReport(){
        List<FacilityBooking> facilityBookingList = new ArrayList<>();
        facilityBookingList.add(bookAFacility(new Long(982982), new Long(8772), new Date(), new Date()));
        facilityBookingList.add(bookAFacility(new Long(42342), new Long(666), new Date(), new Date()));
        facilityBookingList.add(bookAFacility(new Long(123123), new Long(877442), new Date(), new Date()));
        return facilityBookingList;
    }


    public List<TrainingBooking> getTrainingBookingReport(){
        List<TrainingBooking> trainingBookings = new ArrayList<>();
        trainingBookings.add(bookTraining(new Long(982982), new Long(8772)));
        trainingBookings.add(bookTraining(new Long(42342), new Long(666)));
        trainingBookings.add(bookTraining(new Long(123123), new Long(877442)));
        return trainingBookings;
    }

    public Map<String, List> getAllReports(){
        Map<String, List> reportMap = new HashMap<>();
        reportMap.put("TrainingReport", getTrainingBookingReport());
        reportMap.put("FacilityReport", getFacilityBookingReport());
        reportMap.put("ReceiptReport", getAllReceipts());
        return reportMap;
    }

    public TrainingPricing updateTrainingPricing(Long batchNumber, double newPrice, Date newEffectiveDate){
        //Get pricing records based on batchnumber
        return new TrainingPricing(newPrice, newEffectiveDate, batchNumber);
    }

    public FacilityPricing updateFacilityPricing(Long facilityId, double newPrice, Date newEffectiveDate){
        //Get pricing records based on facility
        return new FacilityPricing(newPrice, newEffectiveDate, facilityId);
    }

    public List<Receipt> getAllReceipts(){
        List<Receipt> allreceipts = new ArrayList<>();
        allreceipts.add(new Receipt(123, new Date(), new Long(324234)));
        allreceipts.add(new Receipt(12, new Date(), new Long(343)));

        return allreceipts;
    }


    public Facility updateFacility(Long facilityId, Boolean isAvailable, String description){
        //Get record from facilityId and update.
        return new Facility("ASD",isAvailable, description);
    }

    public Training updateTraining(Long trainingId, String description, Boolean isActive){
        //Get record from trainingId and update.
        return new Training(description, "ASW", isActive);

    }

    public Batch updateNewBatch(Date startDate, Date endDate, Long batchId, int maxParticipants, User trainerId){

        //Get batch from batchId
       // Batch newBatch = new Batch(startDate, endDate, maxParticipants);
        return this.batch;
    }


    private User addUser(String name, String contactNumber, String email, UserType type ){
        return new User(name, type, contactNumber, email);
    }

    private User updateUser(Long userId, String name, String contactNumber, String email){
        return new User(name, UserType.CUSTOMER, contactNumber, email);
    }
}
