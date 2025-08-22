package oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class mainclass {
    public static void main(String[] args) {
        {

            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();


            Author author = new Author();
            author.setAuthorId(1);
            author.setName("Jon");
            author.setNationality("American");

            books  books=new books();
            books.setTitle("Rich Dad");
            books.getGenre("pp");
            books.setBookId(13);

            books  books1=new books();
            books1.setTitle("Java");
            books1.setGenre("CC");
            books1.setBookId(3);

            List<books> list=new ArrayList<>();
            list.add(books1);
            list.add(books);

            author.setBooksList(list);

            session.save(author);
            transaction.commit();
            session.close();
            factory.close();


        }
    }
}
