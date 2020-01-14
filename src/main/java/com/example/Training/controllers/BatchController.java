package com.example.Training.controllers;

import com.example.Training.Model.Batch;
import com.example.Training.Model.Training;
import com.example.Training.Service.OrganizationService;
import com.example.Training.Views.BatchView;
import com.example.Training.models.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by pana on 14/01/20.
 */
@RestController
@RequestMapping("api/v1/batch")
public class BatchController {
    @Autowired
    private OrganizationService organizationService;
    @PostMapping("")
    public Batch addTraining(@RequestBody BatchView newBatch) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        return this.organizationService.createNewBatch(format.parse(newBatch.getStartDate()), format.parse(newBatch.getEndDate()),
                newBatch.getMaxParticipants());
    }
}
