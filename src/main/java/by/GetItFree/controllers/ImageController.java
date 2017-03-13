package by.GetItFree.controllers;

import by.GetItFree.orm.interfaces.AdvertORMService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * Created by nolik on 10.03.17.
 */
@Controller
public class ImageController {
    @Autowired
    private AdvertORMService jpaAdvertORMService;

    /**
     * Old implementation of showing image on main page, but it's work.
     *
     *
     * @param response
     * @param advertID
     * @throws IOException
     */
    @RequestMapping(value = "/getAdvertImage/{id}", method = RequestMethod.GET)
    public void getAdvertImage(HttpServletResponse response, @PathVariable("id") int advertID) throws IOException {
        response.setContentType("image/jpeg");
        byte[] buffer = jpaAdvertORMService.getWithProfile(advertID).getImage();
        InputStream in1 = new ByteArrayInputStream(buffer);
        IOUtils.copy(in1, response.getOutputStream());
    }
}

