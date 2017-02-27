package com.bloody.indian.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AB75547 on 2/27/2017.
 */
@RestController
@RequestMapping("/whois")
public class BloodyindianController {

    private static final Logger log = LoggerFactory.getLogger(BloodyindianController.class);

    @RequestMapping(value = "/there", method = RequestMethod.GET)
    public String bloodyindiansays() {
        log.info("source={}&action=bloodyindiansays&request={}", this.getClass().getSimpleName());
        return "Hi Chennai... ";
    }
}
