package com.bloody.indian.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import java.util.*;


/**
 * The {@link SfaintService} implements business logic for
 * Sales force integeration
 */

/**
 * @author Dinesh
 */
@Service
@Configuration
public class BloodyindianService {

    private static final Logger log = LoggerFactory.getLogger(BloodyindianService.class);

    @Autowired
    private BloodyindianRepository bloodyindianRepository;


    public BloodyIndian pickwho() {
        return bloodyindianRepository.findBloodyIndianByOrderId("123");
    }
}

