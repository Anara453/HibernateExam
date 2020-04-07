package kg.db;

import kg.entiti.Likes;
import kg.util.HibernateUtil;
import org.hibernate.Session;

public class LikesDB {
    public static Likes createLike (Likes likes){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(likes);
        session.getTransaction().commit();
        session.close();
        return likes;
    }
}
