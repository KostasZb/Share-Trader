package com.kzmpekos.sharetrader.Controllers;

import com.kzmpekos.sharetrader.models.Member;
import com.kzmpekos.sharetrader.services.INewsService;
import com.kzmpekos.sharetrader.services.IRemindersService;
import com.kzmpekos.sharetrader.viewmodels.NewsViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private IRemindersService service;
    @Autowired
    private INewsService newsService;


    //creating the view for News based on the user's notifications
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView getNews(HttpSession session) {
        Member tempMember = (Member) session.getAttribute("user");
        String id = String.valueOf(tempMember.getUserid());
        NewsViewModel newsViewModel = newsService.getNewsViewModel(service.getAllReminders(id));
        ModelAndView news = createModelAndView("news", "newsList", newsViewModel);
        return news;
    }

    private ModelAndView createModelAndView(String viewName, String objectName, Object t) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject(objectName, t);
        return mav;
    }
}
