package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.Cargo;

import java.util.List;

public interface CargoService {
    List<Cargo> getAllCargos();
    Cargo getCargoById(int id);
    Cargo saveCargo(Cargo cargo);
    void deleteCargo(int id);
}
