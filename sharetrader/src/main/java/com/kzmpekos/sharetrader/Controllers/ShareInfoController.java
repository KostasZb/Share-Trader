package com.kzmpekos.sharetrader.Controllers;

import com.kzmpekos.sharetrader.services.ISharesService;
import com.kzmpekos.sharetrader.viewmodels.ShareInformationViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/shareinfo/")
public class ShareInfoController {

    @Autowired
    private ISharesService service;

    @PostMapping(value = "{tradingCode}")
    public ShareInformationViewModel getShareInformation(@PathVariable("tradingCode") String tradingCode) {
        return service.getShareInformation(tradingCode);
    }

    @RequestMapping(value = "{tradingCode}", method = RequestMethod.GET)
    public ModelAndView shareInfoPage(@PathVariable("tradingCode") String tradingCode, HttpSession session) {
        ShareInformationViewModel shareInformationViewModel = getShareInformation(tradingCode);
        ModelAndView shareInfo = createModelAndView("share", "shareInfo", shareInformationViewModel);
        return shareInfo;
    }


    private ModelAndView createModelAndView(String viewName, String objectName, Object t) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        mav.addObject(objectName, t);
        return mav;
    }


}
