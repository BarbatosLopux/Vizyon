package com.example.GestionAudioVisal.domain.repository;

import com.example.GestionAudioVisal.persistence.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}
