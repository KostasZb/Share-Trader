package com.kzmpekos.sharetrader.Controllers;

import com.kzmpekos.sharetrader.services.ISharesService;
import com.kzmpekos.sharetrader.viewmodels.ShareHomeViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/home/")
public class HomeController {

    @Autowired
    private ISharesService service;


    //Loading a list of Shares based on the stockmarket chosen
    @RequestMapping(value = "{exchange}", method = RequestMethod.GET)
    public ModelAndView homePage(@PathVariable("exchange") String exchange, HttpSession session) {
        ShareHomeViewModel viewModel = new ShareHomeViewModel(service.getShares(exchange));
        ModelAndView shareHome = createModelAndView("home", "home_share", viewModel);
        return shareHome;
    }

    private ModelAndView createModelAndView(String viewName, String objectName, Object t) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject(objectName, t);
        return mav;
    }

}
