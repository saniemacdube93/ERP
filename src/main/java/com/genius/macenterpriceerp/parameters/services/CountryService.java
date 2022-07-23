package com.genius.macenterpriceerp.parameters.services;

import com.genius.macenterpriceerp.parameters.models.Country;
import com.genius.macenterpriceerp.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll(){
        return countryRepository.findAll();
    }


}
