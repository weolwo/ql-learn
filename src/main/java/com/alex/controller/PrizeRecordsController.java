package com.alex.controller;

import com.alex.service.PrizeRecordsService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * BY Alex CREATED 2021/8/18
 */

@RestController
public class PrizeRecordsController {

    @Autowired
    PrizeRecordsService prizeRecordsService;

    @RequestMapping("/test")
    public Object login(HttpServletRequest request) {

        return prizeRecordsService.test();

    }
}
