package com.garage.controller;

import com.garage.entity.Garage;
import com.garage.service.GarageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/garages")
public class GarageController {

    private final GarageService service;

    public GarageController(GarageService service) {
        this.service = service;
    }

    @PostMapping
    public Garage create(@RequestBody Garage g) { return service.create(g); }

    @GetMapping
    public List<Garage> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Garage getById(@PathVariable Long id) { return service.getById(id); }

    @GetMapping("/name/{name}")
    public Garage getByName(@PathVariable String name) { return service.getByName(name); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
