package com.bharath.flightreservation.entities;

import java.util.Date;

/**
 * Created by Simohamed on 2018-03-27.
 */
public class Person {
    private int age;
    private String nomPerson;
    private double prix;
    private Date maDate;

    public Person() {

    }

    public Person(int age, String nom, double prix, Date maDate) {
        this.age = age;
        this.nomPerson = nom;
        this.prix = prix;
        this.maDate = maDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNomPerson() {
        return nomPerson;
    }

    public void setNomPerson(String nomPerson) {
        this.nomPerson = nomPerson;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getMaDate() {
        return maDate;
    }

    public void setMaDate(Date maDate) {
        this.maDate = maDate;
    }


}
