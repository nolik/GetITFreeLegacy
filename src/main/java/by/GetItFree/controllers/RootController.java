package by.GetItFree.controllers;

import by.GetItFree.entities.Advert;
import by.GetItFree.orm.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by max on 09.02.17.
 */
@Controller
public class RootController {

//    @Autowired
//    private AdvertORMService jpaAdvertORMService;
//    @Autowired
//    private CommentORMService jpaCommentORMService;
    @Autowired
    private AdvertService advertService;


    @RequestMapping(value = "/jpaFindAllAdvert", method = RequestMethod.GET)
    public ModelAndView jpaFindAllAdvert() {
        System.out.println("ORMController ormFindAllUsers is called");
        List<Advert> adverts = advertService.findAllAdverts();
        return new ModelAndView("/error/test", "resultObject", adverts);
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndexPage() {
        System.out.println("testMain called");
        List<Advert> adverts = advertService.findAllAdverts();
        System.out.println(adverts.toString());
        return new ModelAndView("index", "listOfAdverts", adverts);
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView aboutPage() {
        return new ModelAndView("/about");
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView contactPage() {
        return new ModelAndView("/contact");
    }

    @RequestMapping(value = "/runtimeException", method = RequestMethod.GET)
    public void throwException() {
        throw new RuntimeException();
    }

    @RequestMapping(value = "/advert/{id}", method = RequestMethod.GET)
    public ModelAndView viewAdvertById(@PathVariable int id) {
        System.out.println("show advert by id="+id);
        Advert advert = advertService.findById(id);
        return new ModelAndView("/advert", "advert", advert);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        System.out.println(id);
       advertService.deleteAdvertById(id);
        return "redirect:/";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable int id, ModelMap model) {
        System.out.println(id);
        Advert advert = advertService.findById(id);
        System.out.println(advert.toString());
        model.addAttribute("adverts", advert);
        model.addAttribute("edit", true);
        return "edit";
    }

    /*
 * This method will be called on form submission, handling POST request for
 * updating news in database. It also validates the user input
 */
    @RequestMapping(value = {"/edit/{id}"}, method = RequestMethod.POST)
    public String update(@Valid Advert advert,
                         ModelMap model, BindingResult result) {

        if (result.hasErrors()) {
            return "edit";
        }
        advert.setImage(advert.getImage());
        byte b=1;
        advert.setOrdered(b);
        advert.setProfileId(1);
        advert.setProfileId(1);
        advert.setProfileUsersUsername("max");
        advert.setDate(new Timestamp(System.currentTimeMillis()));
        advertService.updateAdvert(advert);
        model.addAttribute("id", advert.getId());
        model.addAttribute("success", "News " + advert.getHead() + " updated successfully");
        return "success";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String save(@Valid Advert advert, BindingResult result,
                       ModelMap model) {

        if (result.hasErrors()) {
            return "add";
        }
        byte b=1;
        advert.setOrdered(b);
        advert.setProfileId(1);
        advert.setProfileUsersUsername("max");
        advert.setDate(new Timestamp(System.currentTimeMillis()));
        advertService.saveAdvert(advert);
        model.addAttribute("id", advert.getId());
        model.addAttribute("success", "News " + advert.getContent() + " registered successfully");
        return "success";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.GET)
    public String Add(ModelMap model) {
        Advert advert = new Advert();
        //specify current time
        model.addAttribute("adverts", advert);
        model.addAttribute("edit", false);
        return "add";
    }


}