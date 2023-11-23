package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Habitacion;

public interface IHabitacionesRepository extends JpaRepository<Habitacion, Integer> {

}
