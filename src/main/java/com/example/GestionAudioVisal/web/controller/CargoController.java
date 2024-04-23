package com.example.GestionAudioVisal.web.controller;

import com.example.GestionAudioVisal.domain.service.CargoService;
import com.example.GestionAudioVisal.persistence.entity.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cargos")
public class CargoController {

    private final CargoService cargoService;

    @Autowired
    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping
    public ResponseEntity<List<Cargo>> getAllCargos() {
        List<Cargo> cargos = cargoService.getAllCargos();
        return new ResponseEntity<>(cargos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> getCargoById(@PathVariable("id") int id) {
        Cargo cargo = cargoService.getCargoById(id);
        if (cargo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cargo, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cargo> createCargo(@RequestBody Cargo cargo) {
        Cargo createdCargo = cargoService.saveCargo(cargo);
        return new ResponseEntity<>(createdCargo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCargo(@PathVariable("id") int id) {
        cargoService.deleteCargo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
