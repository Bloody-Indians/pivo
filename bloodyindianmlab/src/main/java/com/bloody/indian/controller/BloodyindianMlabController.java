package com.bloody.indian.controller;

import com.bloody.indian.service.BloodyIndian;
import com.bloody.indian.service.BloodyindianService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AB75547 on 2/27/2017.
 */
@RestController
@RequestMapping("/mlab")
public class BloodyindianMlabController {

    private static final Logger log = LoggerFactory.getLogger(BloodyindianMlabController.class);
    @Autowired
    private BloodyindianService bloodyindianService;

    @RequestMapping(value = "/says", method = RequestMethod.GET)
    public BloodyIndian bloodyindiansays() {

        return bloodyindianService.pickwho();
    }
}
