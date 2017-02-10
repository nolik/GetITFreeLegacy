package by.GetItFree.dao.repository;

import by.GetItFree.entities.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by max on 10.02.2017.
 */
public interface CommentDAORepository extends CrudRepository<Comment,Integer> {
    List<Comment> findByID(int id);

}
