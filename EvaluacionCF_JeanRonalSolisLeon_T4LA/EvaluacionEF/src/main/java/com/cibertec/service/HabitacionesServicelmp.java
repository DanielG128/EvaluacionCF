package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Habitacion;
import com.cibertec.repositorio.IHabitacionesRepository;

@Service
public class HabitacionesServicelmp implements HabitacionesService{
	
	@Autowired
	private IHabitacionesRepository habitacionesRepository;

	@Override
	public List<Habitacion> obtenerTodos() {		
		return habitacionesRepository.findAll();
	}

	@Override
	public Habitacion obtenerPorId(Integer id) {
		return habitacionesRepository.findById(id).orElse(null);
	}

	@Override
	public void guardarHabitacion(Habitacion habitacion) {
		habitacionesRepository.save(habitacion);

	}

}
