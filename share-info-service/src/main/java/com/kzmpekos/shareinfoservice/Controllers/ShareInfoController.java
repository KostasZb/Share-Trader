package com.kzmpekos.shareinfoservice.Controllers;

import com.kzmpekos.shareinfoservice.models.Share;
import com.kzmpekos.shareinfoservice.models.ShareDetails;
import com.kzmpekos.shareinfoservice.services.IShareInfoService;
import com.kzmpekos.shareinfoservice.services.ShareInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.List;

@RestController
@RequestMapping("/sharedata")
public class ShareInfoController {
    IShareInfoService service=new ShareInfoService();

    @RequestMapping(value=("/shares/{tradingCode}"), method = RequestMethod.GET)
    public Share getShareInfo(@PathVariable("tradingCode") String tradingCode) throws MalformedURLException {
        return service.getShare(tradingCode);

    }

    @RequestMapping(value = ("/shareInfo/{tradingCode}"), method = RequestMethod.GET)
    public ShareDetails getShareDetails(@PathVariable("tradingCode") String tradingCode) throws MalformedURLException {
        return service.getShareDetails(tradingCode);
    }

    @RequestMapping(value="/allshares/{exchange}",method=RequestMethod.GET)
    public List<Share> getAllShares(@PathVariable("exchange") String exchange) throws MalformedURLException {
        return service.getAllShares(exchange);
    }
}
