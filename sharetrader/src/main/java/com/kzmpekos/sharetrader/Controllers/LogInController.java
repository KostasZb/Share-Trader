package com.kzmpekos.sharetrader.Controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kzmpekos.sharetrader.models.LogInResponse;
import com.kzmpekos.sharetrader.models.Member;
import com.kzmpekos.sharetrader.services.ILogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("")
public class LogInController {


    @Autowired
    ILogInService logInService;

    @RequestMapping(value = {"/sharetrader"}, method = RequestMethod.GET)
    public ModelAndView landingPage(HttpSession session) {

        if ((session.getAttribute("user") != null)) {
            session.setAttribute("user", null);
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @PostMapping(value = {"/sharetrader"})
    public ModelAndView loginResultPage(@ModelAttribute Member memberTemp, HttpSession session) throws JsonProcessingException {
        LogInResponse response;
        if (memberTemp.getUsername() == null) {
            response = logInService.signIn(memberTemp);
        } else {
            response = logInService.register(memberTemp);
        }
        if (response.getSuccess()) {
            String memberDetails = response.getResult();
            Member member = new ObjectMapper().readValue(memberDetails, Member.class);
            member.setEmail("");
            member.setPassword("");
            session.setAttribute("user", member);
            ModelAndView loginSuccess = createModelAndView("loginSuccess", "member", member);
            return loginSuccess;
        } else {

            ModelAndView loginFailure = createModelAndView("loginFailure", "response", response);
            return loginFailure;
        }
    }

    private ModelAndView createModelAndView(String viewName, String objectName, Object t) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject(objectName, t);
        return mav;
    }
}
