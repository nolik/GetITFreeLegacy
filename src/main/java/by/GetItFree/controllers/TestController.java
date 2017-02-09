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
        System.out.println("CookieController readCookieExample() is called");
        //you can use also " @CookieValue(value = "cookieName") String cookieName " >cookieName = Cookie.getName();
        String cookieValue = "Трынь трынь ПАРАХОД ГУДИТ111";
        return new ModelAndView("/error/errorpage");
    }
}
