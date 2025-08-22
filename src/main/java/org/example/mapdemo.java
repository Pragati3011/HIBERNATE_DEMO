package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapdemo {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        //creating question onj
        question q1 = new question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java");

        question q2 = new question();
        q2.setQuestionId(2424);
        q2.setQuestion("what is collection framework");



        //creating answer obj
        Answer an1=new Answer();
        an1.setAnsw_id(324);
        an1.setAnswer("Java is a language");
        an1.setQuestion(q1);
        q1.setAnswer(an1);


        //creating answer obj
        Answer an2=new Answer();
        an2.setAnsw_id(344);
        an2.setAnswer("api to work with java");
        an1.setQuestion(q2);
        q2.setAnswer(an2);


        //session
        Session s =factory.openSession();
        Transaction tx = s.beginTransaction();

        //save
        s.save(q1);
        s.save(q2);
        s.save(an1);
        s.save(an2);

        tx.commit();

        s.close();
        factory.close();
        System.out.println("Data is saved successfully!!!!!!!!!!!!");
    }
}
