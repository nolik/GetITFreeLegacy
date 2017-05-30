package by.GetItFree.controllers;


import by.GetItFree.orm.service.AdvertService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletResponse;

import java.io.*;


/**
 * Created by nolik on 10.03.17.
 */
@Controller
public class ImageController {
//    @Autowired
//    private AdvertORMService jpaAdvertORMService;
@Autowired
private AdvertService advertService;
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
        byte[] buffer = advertService.findById(advertID).getImage();
        InputStream in1 = new ByteArrayInputStream(buffer);
        IOUtils.copy(in1, response.getOutputStream());
    }
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public @ResponseBody
    String handleFileUpload(@RequestParam("file") MultipartFile file) {

        if (!file.isEmpty()) {

            try {

                byte[] fileBytes = file.getBytes();
                String rootPath = System.getProperty("catalina.home");
                System.out.println("Server rootPath: " + rootPath);
                System.out.println("File original name: " + file.getOriginalFilename());
                System.out.println("File content type: " + file.getContentType());

                File newFile = new File(rootPath + File.separator + file.getOriginalFilename());
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(newFile));
                stream.write(fileBytes);
                stream.close();

                System.out.println("File is saved under: " + rootPath + File.separator + file.getOriginalFilename());
                return "File is saved under: " + rootPath + File.separator + file.getOriginalFilename();

            } catch (Exception e) {
                e.printStackTrace();
                return "File upload is failed: " + e.getMessage();
            }
        } else {
            return "File upload is failed: File is empty";
        }
    }
}




