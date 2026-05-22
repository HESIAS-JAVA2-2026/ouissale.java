package com.garage.service;

import com.garage.entity.Garage;
import com.garage.repository.GarageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageService {

    private final GarageRepository repository;

    public GarageService(GarageRepository repository) {
        this.repository = repository;
    }

    public Garage create(Garage g) { return repository.save(g); }
    public List<Garage> getAll() { return repository.findAll(); }
    public Garage getById(Long id) { return repository.findById(id).orElseThrow(); }
    public Garage getByName(String name) { return repository.findByName(name).orElseThrow(); }
    public void delete(Long id) { repository.deleteById(id); }
}
