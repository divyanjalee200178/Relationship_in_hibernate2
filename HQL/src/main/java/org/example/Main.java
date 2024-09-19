package org.example;
import org.example.confi.FactoryConfiguration;
import org.example.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

//        Person person=session.get(Person.class ,1);
//        System.out.println(person.getId());
//        System.out.println(person.getIdCard());
//
        Query query=session.createQuery("from Person");
        List<Person> list=query.list();

        for(Person person:list){
            System.out.println(person);
        }

//        Query query=session.createQuery("from Person  where id=?1");
//
//        query.setParameter(1,1);
//        Person person= (Person) query.uniqueResult();
//        System.out.println(person.getId());

//        Query query=session.createQuery("select id from Person where id=?1");
//        query.setParameter(1,1);
//        Person person=(Person) query.uniqueResult();
//        System.out.println(person.getId());

//        Query query=session.createQuery("select id,name from Person where id=?1");
//        List<Person> listResult = query.list();
//        for(Person person:listResult) {
//        Person person1=(Person) query.uniqueResult();
//            System.out.println(person.getId());
//        }

        //------insert----------
//        Query query = session.createQuery("insert into Person (id,name,address) values(?1,?2,?3)");
//        query.setParameter(1,2);
//        query.setParameter(2,"Kalutara");
//        query.setParameter(3,"kevin");
//        query.executeUpdate();

        //-------update-----------------
//        Query query = session.createQuery("update Person set name=?1 where id = ?2");
//        query.setParameter(1,"Saman");
//        query.setParameter(2,4);
//        query.executeUpdate();

        //-----------delete--------------

       /* Query query3=session.createQuery("delete from Person where id=1");
        query3.setParameter(1,2);
        query3.executeUpdate();*/


        transaction.commit();
        session.close();
    }
}