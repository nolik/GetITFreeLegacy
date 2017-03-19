package by.GetItFree.controllers;

import by.GetItFree.entities.Advert;
import by.GetItFree.orm.interfaces.AdvertORMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nolik on 21.02.17.
 */
@RestController
public class AdvertRestController {

    @Autowired
    private AdvertORMService jpaAdvertORMService;

    /** look to mvc-config.xml for <mvc:message-converters>. It can produce 'pretty' json response. */
    @RequestMapping(value = "/rest/getAdvertJSON/{headAdvert}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Advert getAllAdvertJSON(@PathVariable String headAdvert) {

        return jpaAdvertORMService.findByHead(headAdvert);
    }

    @RequestMapping(value = "/rest/advert/{id}", method = RequestMethod.GET)
    public @ResponseBody Advert getRestAdvertById(@PathVariable int id) {
        System.out.println("get advert by id="+id);
        Advert advert = jpaAdvertORMService.getWithProfile(id);
        return advert;
    }

    @RequestMapping(value = "/rest/listLast9Adverts/", method = RequestMethod.GET)
    public @ResponseBody
    List<Advert> listLast9Adverts() {
        System.out.println("get listLast9Adverts");
        List<Advert> advert = jpaAdvertORMService.findFirst9ByOrderByDateDesc();
        return advert;
    }
}
