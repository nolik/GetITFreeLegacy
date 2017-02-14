package by.GetItFree.controllers;

import by.GetItFree.entities.Advert;
import by.GetItFree.orm.interfaces.AdvertDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by max on 09.02.17.
 */
@Controller
public class TestController {

    @Autowired
    AdvertDAO jpaAdvertDAO;


    @RequestMapping(value = "/testCall", method = RequestMethod.GET)
    public ModelAndView readCookieExample() {

        System.out.println(" Test console");
        return new ModelAndView("/error/errorpage");

    }

    @RequestMapping(value = "/jpaFindAllAdvert", method= RequestMethod.GET)
    public ModelAndView jpaFindAllAdvert() {
        System.out.println("ORMController ormFindAllUsers is called");
      //  List<Advert> adverts = jpaAdvertDAO.findAll();
        List<Advert> adverts = jpaAdvertDAO.findAll();
         return new ModelAndView("/error/test", "resultObject", adverts);
//        return new ModelAndView("/error/test");
    }

}