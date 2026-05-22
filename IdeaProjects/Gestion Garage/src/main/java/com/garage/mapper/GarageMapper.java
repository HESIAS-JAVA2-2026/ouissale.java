package com.garage.mapper;

import com.garage.dto.GarageDto;
import com.garage.entity.Garage;

public class GarageMapper {

    public static GarageDto toDto(Garage garage) {
        GarageDto dto = new GarageDto();
        dto.setId(garage.getId());
        dto.setName(garage.getName());
        return dto;
    }

    public static Garage toEntity(GarageDto dto) {
        Garage garage = new Garage();
        garage.setName(dto.getName());
        return garage;
    }
}
