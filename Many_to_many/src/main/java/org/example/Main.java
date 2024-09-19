package org.example;

import org.example.confi.FactoryConfiguration;
import org.example.entity.IdCard;
import org.example.entity.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        Person person1=new Person();
        person1.setId(1);
        person1.setName("Navindu");
        person1.setAddress("Galle");


        Person person2=new Person();
        person2.setId(2);
        person2.setName("Navindu");
        person2.setAddress("Galle");



        IdCard idCard1=new IdCard();
        idCard1.setId(3);
        idCard1.setName("Silva");
        idCard1.setType("Male");


        IdCard idCard2=new IdCard();
        idCard2.setId(4);
        idCard2.setName("Perera");
        idCard2.setType("Male");



        List<IdCard> idCard=new ArrayList<>();
        idCard.add(idCard1);
        idCard.add(idCard2);

        List<Person> person=new ArrayList<>();
        person.add(person1);
        person.add(person2);


        idCard1.setPerson(person);
        idCard2.setPerson(person);

        person1.setIdCard(idCard);
        person2.setIdCard(idCard);

        session.save(person1);
        session.save(person2);
        session.save(idCard1);
        session.save(idCard2);

        transaction.commit();
        session.close();
    }
}