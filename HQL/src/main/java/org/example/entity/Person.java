package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Person {
    @Id
    private int id;
    private String address;
    //Inverse side
    @Column
    private String name;
    @OneToMany(mappedBy = "person")

    private List<IdCard> idCard;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IdCard> getIdCard() {
        return idCard;
    }

    public void setIdCard(List<IdCard> idCard) {
        this.idCard = idCard;
    }

    public Person(int id, String address, String name, List<IdCard> idCard) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.idCard = idCard;
    }

    public Person() {
    }
}