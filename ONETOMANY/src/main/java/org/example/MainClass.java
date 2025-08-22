package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();


        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Arushiiii");
        s1.setAbout("Add details");


        Address a1 = new Address(1, "Maharashtra", "Pune", "India");
        Address a2 = new Address(2, "Maharashtra", "Mumbai", "India");


        a1.setStudent(s1);
        a2.setStudent(s1);

        List<Address> addresses = new ArrayList<>();
        addresses.add(a1);
        addresses.add(a2);
        s1.setAdd(addresses);

        session.save(s1); // Cascades to Address


        transaction.commit();


        session.close();
        factory.close();
    }
}
