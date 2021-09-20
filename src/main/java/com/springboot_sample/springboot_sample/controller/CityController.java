package com.springboot_sample.springboot_sample.controller;

import com.springboot_sample.springboot_sample.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public ResponseEntity<?> getCities(@RequestParam Integer page, String sort) {
        try {
            return ResponseEntity.ok(cityService.getCities(page, sort));
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCityById(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(cityService.getCityById(id));
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }
}
