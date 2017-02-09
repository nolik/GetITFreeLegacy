package by.GetItFree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by max on 09.02.17.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/testCall", method = RequestMethod.GET)
    public ModelAndView readCookieExample() {
        System.out.println(" Test console");
        return new ModelAndView("/error/errorpage");
    }
}
