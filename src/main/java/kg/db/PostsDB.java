package kg.db;

import kg.entiti.Posts;
import kg.entiti.User;
import kg.util.HibernateUtil;
import org.hibernate.Session;

public class PostsDB  {
    public static Posts createPost (Posts posts){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(posts);
        session.getTransaction().commit();
        session.close();
        return posts;
    }

}
