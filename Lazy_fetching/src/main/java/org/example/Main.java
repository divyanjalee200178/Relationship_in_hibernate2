package org.example;

import org.example.confi.FactoryConfiguration;
import org.example.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Person person=session.get(Person.class ,1);
        System.out.println(person.getId());
        System.out.println(person.getIdCard());

        transaction.commit();
        session.close();
    }
}