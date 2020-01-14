package com.example.Training.Config;

import com.example.Training.Model.Training;
import com.example.Training.Model.User;
import com.example.Training.Model.UserType;
import com.example.Training.Service.OrganizationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pana on 14/01/20.
 */
@Configuration
public class ConfigMain {
    @Bean
    public Training getTraining(){return new Training("Default TRaining", "Cricket", true ); }

    @Bean("trainer")
    public User getTrainer(){return new User("Trainer 1", UserType.TRAINER, "9448898713", "xyz@abc.com");}

    @Bean
    public OrganizationService getOrganisationService(){ return new OrganizationService();}
}
