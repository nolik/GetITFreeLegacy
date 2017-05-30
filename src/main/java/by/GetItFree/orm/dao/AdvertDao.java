package by.GetItFree.orm.dao;

import by.GetItFree.entities.Advert;

import java.util.List;

/**
 * Created by max on 05.04.17.
 */
public interface AdvertDao {

    List<Advert> findAllAdverts();
    Advert findById(int id);

    void deleteAdvertById(int id);

    void updateAdvert(Advert advert);

    void saveAdvert(Advert advert);
}
