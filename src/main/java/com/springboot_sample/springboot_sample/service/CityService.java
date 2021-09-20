package com.springboot_sample.springboot_sample.service;

import com.springboot_sample.springboot_sample.entity.City;
import com.springboot_sample.springboot_sample.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public Page<City> getCities(Integer page, String sort) {
        Pageable pageable = PageRequest.of(page, 10, Sort.by(sort));
        return cityRepository.findAll(pageable);
    }

    public Optional<City> getCityById(Integer id) {
        return cityRepository.findById(id);
    }
}
