package by.GetItFree.orm.impl;

import by.GetItFree.orm.interfaces.AdvertDAO;
import by.GetItFree.orm.repository.AdvertDAORepository;
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

@Service("jpaAdvertDAO")
@Repository
@Transactional
public class AdvertDAOImpl implements AdvertDAO {

    @Autowired
    private AdvertDAORepository advertDAORepository;

    @Override
    public List<Advert> findAll() {

        return Lists.newArrayList(advertDAORepository.findAll());
    }

    @Override
    public Advert findByHead(String head) {

        return (Advert) advertDAORepository.findByHead(head);
    }
}
