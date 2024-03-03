package com.rentsmart.service;

import com.rentsmart.model.Apartment;
import com.rentsmart.model.ApartmentRequest;
import com.rentsmart.model.User;
import com.rentsmart.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Autowired
    public ApartmentService(ApartmentRepository _apartmentRepository) {
        apartmentRepository = _apartmentRepository;
    }

    public List<Apartment> getAllApartments(){
        return apartmentRepository.findAll();
    }

    public Apartment createApartment(Apartment apartment){
        Apartment createdApartment = apartmentRepository.save(apartment);
        return createdApartment;
    }

    public Apartment convertApartment(ApartmentRequest apartmentRequest){
        Apartment apartment = new Apartment();
        apartment.apartmentNumber = apartmentRequest.apartmentNumber;
        apartment.bathroom = apartmentRequest.bathroom;
        apartment.rent= apartmentRequest.rent;
        apartment.furnished = apartmentRequest.furnished;
        apartment.squareFeet=apartmentRequest.squareFeet;
        apartment.bedrooms=apartmentRequest.bedrooms;
        return apartment;
    }
}
