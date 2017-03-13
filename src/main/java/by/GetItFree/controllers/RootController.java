package by.GetItFree.controllers;

import by.GetItFree.entities.Advert;
import by.GetItFree.entities.Comment;
import by.GetItFree.orm.interfaces.AdvertORMService;
import by.GetItFree.orm.interfaces.CommentORMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by max on 09.02.17.
 */
@Controller
public class RootController {

    @Autowired
    private AdvertORMService jpaAdvertORMService;
    @Autowired
    private CommentORMService jpaCommentORMService;

    @RequestMapping(value = "/testCall", method = RequestMethod.GET)
    public ModelAndView readCookieExample() {

        System.out.println(" Test console");
        return new ModelAndView("/error/errorpage");

    }

    @RequestMapping(value = "/jpaFindAllAdvert", method = RequestMethod.GET)
    public ModelAndView jpaFindAllAdvert() {
        System.out.println("ORMController ormFindAllUsers is called");
        List<Advert> adverts = jpaAdvertORMService.findAll();
        return new ModelAndView("/error/test", "resultObject", adverts);
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndexPage() {
        System.out.println("testMain called");
        List<Advert> adverts = jpaAdvertORMService.findAll();
        return new ModelAndView("/index", "listOfAdverts", adverts);
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView aboutPage() {
        return new ModelAndView("/about");
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView contactPage() {
        return new ModelAndView("/contact");
    }

    @RequestMapping(value = "/jpaFindAdvertById/{id}", method = RequestMethod.GET)
    public ModelAndView jpaFindAdvertById(@PathVariable int id) {
        System.out.println("ORMController jpaFindAdvertById is called");
        Advert advert = jpaAdvertORMService.getWithProfile(id);
        return new ModelAndView("/error/test", "resultObject", advert);
    }

    @RequestMapping(value = "/jpaFindAllComments", method = RequestMethod.GET)
    public ModelAndView jpaFindAllComments() {
        System.out.println("ORMController FindAllComments is called");
        List<Comment> comments = jpaCommentORMService.findAll();
        return new ModelAndView("/error/test", "resultObject", comments);
    }

    @RequestMapping(value = "/runtimeException", method = RequestMethod.GET)
    public void throwException() {
        throw new RuntimeException();
    }

    @RequestMapping(value = "/advert/{id}", method = RequestMethod.GET)
    public ModelAndView viewAdvertById(@PathVariable int id) {
        System.out.println("show advert by id="+id);
        Advert advert = jpaAdvertORMService.getWithProfile(id);
        return new ModelAndView("/advert", "advert", advert);
    }

    @RequestMapping(value = "/last-advert", method = RequestMethod.GET)
    public ModelAndView getLast9Advert() {
        System.out.println("findFirst9ByOrderByDateDesc");
        List<Advert> advertList = jpaAdvertORMService.findFirst9ByOrderByDateDesc();
        return new ModelAndView("/index", "listOfAdverts", advertList);
    }
}