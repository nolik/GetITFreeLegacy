//package by.GetItFree.orm.impl;
//
//import by.GetItFree.orm.interfaces.CommentDAO;
//import by.GetItFree.orm.repository.CommentDAORepository;
//import by.GetItFree.entities.Comment;
//import com.google.common.collect.Lists;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * Created by max on 10.02.2017.
// */
//@Service("jpaCommentDAO")
//@Repository
//@Transactional
//public class CommentDAOImpl implements CommentDAO {
//    @Autowired
//    private CommentDAORepository commentDAORepository;
//    @Override
//    public List<Comment> findAll() {
//        return Lists.newArrayList(commentDAORepository.findAll());
//    }
//
//    @Override
//    public Comment findByiD(int id) {
//        return (Comment) commentDAORepository.findByID(id);
//    }
//}
