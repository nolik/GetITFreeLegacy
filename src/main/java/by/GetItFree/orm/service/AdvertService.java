package by.GetItFree.orm.service;

import by.GetItFree.entities.Advert;

import java.util.List;

/**
 * Created by max on 05.04.17.
 */
public interface AdvertService {
    List<Advert> findAllAdverts();
    Advert findById(int id);


    void deleteAdvertById(int id);

    void updateAdvert(Advert advert);

    void saveAdvert(Advert advert);
}


