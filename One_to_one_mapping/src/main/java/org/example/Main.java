package org.example;


import org.example.confi.FactoryConfiguration;
import org.example.entity.IdCard;
import org.example.entity.Person;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Person person=new Person();
        person.setId(2);
        person.setName("Silva");
        person.setAddress("Kalutara");

        IdCard idCard=new IdCard();
        idCard.setId(1);
        idCard.setName("Kevin");
        idCard.setType("Male");
        idCard.setPerson(person);


//        person.setIdCard(idCard);

        Transaction transaction=session.beginTransaction();
        session.save(idCard);
        session.save(person);
        transaction.commit();
        session.close();
    }
}