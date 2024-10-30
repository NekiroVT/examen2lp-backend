package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.Escuela_ProfecionalDto;
import com.example.demo.entity.Escuela_Profecional;

public interface Escuela_ProfecionalService {
    Escuela_Profecional update(int id, Escuela_ProfecionalDto escuelaDto); // Cambiado para usar id y DTO
    void delete(int id);
    Optional<Escuela_Profecional> read(int id);
    List<Escuela_Profecional> readAll();
    Escuela_Profecional guardarEscuela_Profecional(Escuela_ProfecionalDto escuela_ProfecionalDto);
}