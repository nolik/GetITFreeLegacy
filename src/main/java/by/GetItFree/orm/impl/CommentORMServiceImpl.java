package by.GetItFree.orm.impl;

import by.GetItFree.orm.interfaces.CommentORMService;
import by.GetItFree.orm.repository.CommentORMRepository;
import by.GetItFree.entities.Comment;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by max on 10.02.2017.
 */
@Service("jpaCommentORMService")
@Repository
@Transactional
public class CommentORMServiceImpl implements CommentORMService {
    @Autowired
    private CommentORMRepository commentORMRepository;
    @Override
    public List<Comment> findAll() {
        return Lists.newArrayList(commentORMRepository.findAll());
    }

    @Override
    public List<Comment> findByMessage(String message) {
        return Lists.newArrayList(commentORMRepository.findByMessage(message));
    }
}
