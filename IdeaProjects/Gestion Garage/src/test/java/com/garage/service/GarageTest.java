package com.garage.controller;

import com.garage.entity.Garage;
import com.garage.service.GarageService;
import org.springframework.web.bind.annotation.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    private GarageRepository GarageRepository;


    @InjectMocks
    private GarageService GarageService;

    @Test
    void shouldGarageToId() {
        Long GarageId = 1L;

        Garage Garage = new Garage();
        Garage.setId(GarageId);

        Garage Garage = new Garage("Test Garage");

    }
}
