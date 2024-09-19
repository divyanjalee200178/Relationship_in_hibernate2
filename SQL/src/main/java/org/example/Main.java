package org.example;

import org.example.confi.FactoryConfiguration;
import org.example.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //        insert,update,delete,searchById


//        Person person=session.get(Person.class ,1);
//        System.out.println(person.getId());
//        System.out.println(person.getIdCard());

//        NativeQuery query = session.createNativeQuery("select * from person");

//        query.addEntity(Person.class);
//        List<Person> list = query.list();
//        for (Person person : list) {
//            System.out.println(person);
//        }

        transaction.commit();
        session.close();
    }
}