package com.kzmpekos.sharetrader.Controllers;

import com.kzmpekos.sharetrader.models.Member;
import com.kzmpekos.sharetrader.models.NewNotification;
import com.kzmpekos.sharetrader.models.Reminder;
import com.kzmpekos.sharetrader.services.IRemindersService;
import com.kzmpekos.sharetrader.viewmodels.RemindersViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/reminders")
public class RemindersController {
    @Autowired
    private IRemindersService service;

    //creating the model and view for reminders based on user's chosen reminders
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView getReminders(HttpSession session) {
        Member tempMember = (Member) session.getAttribute("user");
        String id = String.valueOf(tempMember.getUserid());
        RemindersViewModel viewModel = new RemindersViewModel(service.getAllReminders(id));
        ModelAndView shareReminders = createModelAndView("reminders", "shareReminders", viewModel);
        return shareReminders;
    }

    private ModelAndView createModelAndView(String viewName, String objectName, Object t) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject(objectName, t);
        return mav;
    }

    //Registering a user's interest in a share
    @PostMapping(value = "/registerInterest")
    public String registerInterest(String tradingCode, int valueMax, int valueMin, HttpSession session) {
        NewNotification newNotification = new NewNotification();
        newNotification.setTradingCode(tradingCode);
        Member tempMember = (Member) session.getAttribute("user");
        newNotification.setUserId(tempMember.getUserid());
        if (valueMax != 0) {
            newNotification.setNotificationValueMax(valueMax);
        }
        if (valueMin != 0) {
            newNotification.setNotificationValueMin(valueMin);
        }
        String response = service.registerInterest(newNotification);
        return response;
    }

    @PostMapping(value = "/getReminders")
    public List<Reminder> getUsersReminders(HttpSession session) {
        Member tempMember = (Member) session.getAttribute("user");
        return service.getAllReminders(String.valueOf(tempMember.getUserid()));
    }

}
