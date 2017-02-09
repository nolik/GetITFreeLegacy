package by.GetItFree.dao.interfaces;

import by.GetItFree.entities.Advert;

import java.util.List;

/**
 * DAO interface responsible for operation with Advertising.
 * <p>
 * Created by Novik Igor on 09.02.2017.
 */
public interface AdvertDAO {

    /**
     * Method returned list of Advert's from the DB.
     *
     * @return list of Advertising's.
     */
    List<Advert> findAll();

    /**
     * Method returned list of Advert from the DB according ID.
     *
     * @param id id of the Advert;
     * @return Advertising according id.
     */
    Advert findByiD(int id);
}
