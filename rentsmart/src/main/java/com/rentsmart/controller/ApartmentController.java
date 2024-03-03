package com.rentsmart.controller;

import com.rentsmart.model.Apartment;
import com.rentsmart.model.ApartmentRequest;
import com.rentsmart.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ApartmentController {
    private final ApartmentService apartmentService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping("/apartment/getAll")
    public List<Apartment> GetApartments() {
        return apartmentService.getAllApartments();
    }
    @PostMapping("/apartment/create")
    public Apartment CreateApartment(@RequestBody ApartmentRequest apartmentRequest)
    {
        Apartment mappedApartment = apartmentService.convertApartment(apartmentRequest);
        return apartmentService.createApartment(mappedApartment);
    }

}
