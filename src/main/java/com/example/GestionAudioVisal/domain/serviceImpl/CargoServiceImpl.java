package com.example.GestionAudioVisal.domain.serviceImpl;

import com.example.GestionAudioVisal.domain.repository.CargoRepository;
import com.example.GestionAudioVisal.domain.service.CargoService;
import com.example.GestionAudioVisal.persistence.entity.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CargoServiceImpl implements CargoService {

    private final CargoRepository cargoRepository;

    @Autowired
    public CargoServiceImpl(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public List<Cargo> getAllCargos() {
        return cargoRepository.findAll();
    }

    @Override
    public Cargo getCargoById(int id) {
        return cargoRepository.findById(id).orElse(null);
    }

    @Override
    public Cargo saveCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    @Override
    public void deleteCargo(int id) {
        cargoRepository.deleteById(id);
    }
}
