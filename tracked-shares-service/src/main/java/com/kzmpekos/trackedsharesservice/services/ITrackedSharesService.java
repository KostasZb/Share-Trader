package com.kzmpekos.trackedsharesservice.services;

import com.kzmpekos.trackedsharesservice.models.TrackedShare;


import java.util.List;

public interface ITrackedSharesService {
    public List<TrackedShare> getTrackedShares(String userId);
}
