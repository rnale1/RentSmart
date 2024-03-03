package com.rentsmart.model;

import jakarta.persistence.*;

@Entity
@Table(name="apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int aid;

    @Column(name="aptno", length=45, nullable = true)
    public String apartmentNumber;

    @Column(name="bedrooms", nullable = true)
    public int bedrooms;

    @Column(name="bathroom", nullable = true)
    public int bathroom;

    @Column(name="sqft", nullable = true)
    public double squareFeet;

    @Column(name="rent", nullable = true)
    public double rent;

    @Column(name="furnished", nullable = true)
    public boolean furnished;

}
