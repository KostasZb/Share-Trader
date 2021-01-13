package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.LogInResponse;
import com.kzmpekos.sharetrader.models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LogInService implements ILogInService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public LogInResponse signIn(Member memberTemp) {
        LogInResponse response;
        response = restTemplate.postForEntity("http://Loginservice/login/", memberTemp, LogInResponse.class).getBody();
        return response;
    }

    @Override
    public LogInResponse register(Member memberTemp) {
        LogInResponse response;
        response = restTemplate.postForEntity("http://Loginservice/register/", memberTemp, LogInResponse.class).getBody();
        return response;
    }
}
