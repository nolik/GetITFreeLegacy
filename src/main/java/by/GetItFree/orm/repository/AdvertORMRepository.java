package by.GetItFree.orm.repository;

import by.GetItFree.entities.Advert;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * SpringData AdvertORMService repository.
 *
 * Created by Novik Igor on 10.02.2017.
 */
public interface AdvertORMRepository extends CrudRepository<Advert,Integer> {

    Advert findByHead(String head);

    @Query("SELECT a From Advert a JOIN FETCH a.profile WHERE a.id=?1")
    Advert getWithProfile(int id);

    List<Advert> findFirst9ByOrderByDateDesc();
}
