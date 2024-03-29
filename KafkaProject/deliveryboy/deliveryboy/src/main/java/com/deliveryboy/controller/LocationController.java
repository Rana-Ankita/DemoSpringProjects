package com.deliveryboy.controller;

import com.deliveryboy.service.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    private Logger log = LoggerFactory.getLogger(LocationController.class);
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for (int i = 1; i <= 100000; i++) {
            this.kafkaService.updateLocation("(" + Math.round(Math.random() * 100) + "," + Math.round(Math.random() * 100) + ")");
            this.log.info("message produced" +i);
            System.out.println("-------------------------");
        }
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }

}
