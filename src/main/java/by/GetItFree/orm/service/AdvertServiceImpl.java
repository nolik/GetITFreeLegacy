package by.GetItFree.orm.service;

import by.GetItFree.entities.Advert;
import by.GetItFree.orm.dao.AdvertDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by max on 05.04.17.
 */
@Service("AdvertService")
@Transactional
public class AdvertServiceImpl implements AdvertService {
    @Autowired
    private AdvertDao advertDao;

    @Override
    public Advert findById(int id) {
        return advertDao.findById(id);
    }

    @Override
    public void saveAdvert(Advert advert) {
        advertDao.saveAdvert(advert);
    }

    @Override
    public void updateAdvert(Advert advert) {
        advertDao.updateAdvert(advert);
    }

    @Override
    public void deleteAdvertById(int id) {
        advertDao.deleteAdvertById(id);
    }

    @Override
    public List<Advert> findAllAdverts() {
        return advertDao.findAllAdverts();
    }
}

