package by.GetItFree.controllers;

import by.GetItFree.entities.Advert;
import by.GetItFree.orm.interfaces.AdvertORMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nolik on 21.02.17.
 */
@Controller
public class RestController {

    @Autowired
    private AdvertORMService jpaAdvertORMService;

    /** look to mvc-config.xml for <mvc:message-converters>. It can produce 'pretty' json response. */
    @RequestMapping(value = "/rest/getAdvertJSON/{headAdvert}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Advert getAllAdvertJSON(@PathVariable String headAdvert) {

        return jpaAdvertORMService.findByHead(headAdvert);
    }

}
