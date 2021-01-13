package com.kzmpekos.trackedsharesservice.controllers;

import com.kzmpekos.trackedsharesservice.models.TrackedShare;
import com.kzmpekos.trackedsharesservice.services.ITrackedSharesService;
import com.kzmpekos.trackedsharesservice.services.TrackedSharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trackedShares")
public class TrackedSharesController {

    @Autowired
    private ITrackedSharesService service;
    @RequestMapping("/{userId}")
    public List<TrackedShare> getTrackedShares(@PathVariable("userId") String userId){
        return service.getTrackedShares(userId);
    }
}
