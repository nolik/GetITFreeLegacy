package by.GetItFree.controllers;

import by.GetItFree.entities.Advert;
import by.GetItFree.entities.Comment;
import by.GetItFree.orm.interfaces.AdvertDAO;
import by.GetItFree.orm.interfaces.CommentDAO;
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
    @Autowired
    CommentDAO jpaCommentDAO;

    @RequestMapping(value = "/testCall", method = RequestMethod.GET)
    public ModelAndView readCookieExample() {

        System.out.println(" Test console");
        return new ModelAndView("/error/errorpage");

    }

    @RequestMapping(value = "/jpaFindAllAdvert", method = RequestMethod.GET)
    public ModelAndView jpaFindAllAdvert() {
        System.out.println("ORMController ormFindAllUsers is called");
        List<Advert> adverts = jpaAdvertDAO.findAll();
        return new ModelAndView("/error/test", "resultObject", adverts);

    }

    @RequestMapping(value = "/jpaFindAllComments", method = RequestMethod.GET)
    public ModelAndView jpaFindAllComments() {
        System.out.println("ORMController FindAllComments is called");
        List<Comment> comments = jpaCommentDAO.findAll();
        return new ModelAndView("/error/test", "resultObject", comments);

    }
}