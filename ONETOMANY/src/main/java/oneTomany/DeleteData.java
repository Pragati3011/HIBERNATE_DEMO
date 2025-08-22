package oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
        {

            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();
            Author delete = session.load(Author.class,1);
            session.delete(delete);

            transaction.commit();

            session.close();


        }
    }
}
