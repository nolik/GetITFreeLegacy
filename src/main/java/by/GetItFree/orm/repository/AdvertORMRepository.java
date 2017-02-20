package by.GetItFree.orm.repository;

import by.GetItFree.entities.Advert;
import org.springframework.data.repository.CrudRepository;

/**
 * SpringData AdvertORMService repository.
 *
 * Created by Novik Igor on 10.02.2017.
 */
public interface AdvertORMRepository extends CrudRepository<Advert,Integer> {

    Advert findByHead(String head);

}
