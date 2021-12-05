package com.maycolsr.ApiAlquilarte.repository;

import com.maycolsr.ApiAlquilarte.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
}
