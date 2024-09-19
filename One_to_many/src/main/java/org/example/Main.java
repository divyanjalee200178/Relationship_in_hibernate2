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
        Person person=new Person();
        person.setId(1);
        person.setName("Navindu");
        person.setAddress("Galle");
        session.save(person);

        IdCard idCard=new IdCard(1,"Silva","Male",person);
//        idCard.setId(1);
//        idCard.setName("Silva");
//        idCard.setType("Male");

        IdCard idCard2=new IdCard(2,"Perera","Male",person);
//        idCard.setId(1);
//        idCard.setName("Perera");
//        idCard.setType("Male");
        List<IdCard> idCards=new ArrayList<>();
        idCards.add(idCard);
        idCards.add(idCard2);

        session.save(idCard);
        session.save(idCard2);

        idCard.setPerson(person);
        idCard2.setPerson(person);


        transaction.commit();
        session.close();
    }
}