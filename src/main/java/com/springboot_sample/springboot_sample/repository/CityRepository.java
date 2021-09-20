package com.springboot_sample.springboot_sample.repository;

import com.springboot_sample.springboot_sample.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;


public interface CityRepository extends PagingAndSortingRepository<City, Integer> {
    Page<City> findAll(Pageable pageable);

    Optional<City> findById(Integer id);
}
