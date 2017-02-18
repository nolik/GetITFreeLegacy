package by.GetItFree.orm.repository;

import by.GetItFree.entities.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by max on 10.02.2017.
 */
public interface CommentORMRepository extends CrudRepository<Comment,Integer> {
    List<Comment> findByMessage(String message);

}
