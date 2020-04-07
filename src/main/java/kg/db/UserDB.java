package kg.db;

import kg.entiti.User;
import kg.util.HibernateUtil;
import org.hibernate.Session;

public class UserDB {
    public static User create (User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        return user;
    }
}
