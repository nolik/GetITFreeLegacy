package by.GetItFree.dao.interfaces;

import by.GetItFree.entities.Comment;

import java.util.List;

/**
 * Created by max on 10.02.2017.
 */
public interface CommentDAO {
    List<Comment> findAll();


   Comment findByiD(int id);
}
