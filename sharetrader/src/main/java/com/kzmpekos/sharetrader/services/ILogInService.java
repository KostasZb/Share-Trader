package com.kzmpekos.sharetrader.services;

import com.kzmpekos.sharetrader.models.LogInResponse;
import com.kzmpekos.sharetrader.models.Member;

public interface ILogInService {
    public LogInResponse signIn(Member memberTemp);

    public LogInResponse register(Member memberTemp);
}
