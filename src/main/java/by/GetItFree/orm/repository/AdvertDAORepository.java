package by.GetItFree.orm.repository;

import by.GetItFree.entities.Advert;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * SpringData AdvertDAO repository.
 *
 * Created by Novik Igor on 10.02.2017.
 */
public interface AdvertDAORepository extends CrudRepository<Advert,Integer> {

    List<Advert> findByHead(String head);

}
