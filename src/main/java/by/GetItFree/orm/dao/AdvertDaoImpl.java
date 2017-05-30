package by.GetItFree.orm.dao;

import by.GetItFree.entities.Advert;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by max on 05.04.17.
 */
@Repository("AdvertDao")
public class AdvertDaoImpl extends AbstractDao<Integer, Advert> implements AdvertDao {
    @Override
    public List<Advert> findAllAdverts() {
        Criteria criteria = createEntityCriteria();

        return (List<Advert>) criteria.list();
    }

    @Override
    public void saveAdvert(Advert advert) {

        persist(advert);
    }

    @Override
    public void updateAdvert(Advert advert) {
        getSession().saveOrUpdate(advert);    }

    @Override
    public void deleteAdvertById(int id) {
        Query query = getSession().createSQLQuery("delete from Advert where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    @Override
    public Advert findById(int id) {

        return  getByKey(id);

    }
}
