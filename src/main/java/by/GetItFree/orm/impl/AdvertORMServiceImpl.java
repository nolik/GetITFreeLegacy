package by.GetItFree.orm.impl;

import by.GetItFree.orm.interfaces.AdvertORMService;
import by.GetItFree.orm.repository.AdvertORMRepository;
import by.GetItFree.entities.Advert;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Repository bean that implements JPA DAO Advert interfaces responsible for operation with Advertising from DB.
 * <p>
 * Created by nolik on 10.02.17.
 */

@Service("jpaAdvertORMService")
@Repository
@Transactional
public class AdvertORMServiceImpl implements AdvertORMService {

    @Autowired
    private AdvertORMRepository advertORMRepository;

    @Override
    public List<Advert> findAll() {

        return Lists.newArrayList(advertORMRepository.findAll());
    }

    @Override
    public Advert findByHead(String head) {

        return (Advert) advertORMRepository.findByHead(head);
    }

    @Override
    public Advert getWithProfile(int id) {
        return (Advert) advertORMRepository.getWithProfile(id);
    }


    @Override
    public List<Advert> findFirst9ByOrderByDateDesc() {

        return Lists.newArrayList(advertORMRepository.findFirst9ByOrderByDateDesc());
    }

}
