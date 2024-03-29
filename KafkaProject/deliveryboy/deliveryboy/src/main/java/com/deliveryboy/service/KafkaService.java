package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private Logger log = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location) {

            this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC, location);
        return true;
    }
}
