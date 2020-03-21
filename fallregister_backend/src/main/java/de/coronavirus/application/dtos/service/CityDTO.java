package de.coronavirus.application.dtos.service;

import de.coronavirus.domain.model.Street;

import java.util.List;

public interface CityDTO {

    long getId();
    String getName();
    List<Long> getPostCodes();
    List<Street> getStreets();
}