package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Student deleteData = session.load(Student.class,1);
        System.out.println(deleteData.getStudentId()+deleteData.getStudentName());

        session.delete(deleteData);
        session.close();




    }
}
