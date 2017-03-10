package by.GetItFree.orm.impl;

import by.GetItFree.entities.Advert;
import by.GetItFree.orm.interfaces.AdvertORMService;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by nolik on 19.02.17.
 */

/*
 !Need to cover all ORM Services with Unit tests.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"file:src/main/webapp/WEB-INF/config/mvc-config.xml",
                "file:src/main/webapp/WEB-INF/config/application-context.xml"})
public class AdvertORMServiceTest {

    @Autowired
    private AdvertORMService jpaAdvertORMService;

    @Test
    public void queryAllAdvertsTest() {
        List<Advert> adverts = jpaAdvertORMService.findAll();
        Assert.assertNotNull(adverts);
    }

}
