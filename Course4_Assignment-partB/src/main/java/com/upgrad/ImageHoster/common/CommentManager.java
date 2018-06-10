package com.upgrad.ImageHoster.common;

import com.upgrad.ImageHoster.model.Comment;
import com.upgrad.ImageHoster.model.Image;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


import java.util.List;
public class CommentManager extends  SessionManager {
    public Comment createComment(Comment comment) {
        Session session = openSession();
        session.save(comment);
        commitSession(session);
        return comment;
    }

    public List<Comment> getAllComments() {
        Session session = openSession();
        List<Comment> comments = session.createCriteria(Comment.class).list();
        commitSession(session);
        return comments;
    }
}
