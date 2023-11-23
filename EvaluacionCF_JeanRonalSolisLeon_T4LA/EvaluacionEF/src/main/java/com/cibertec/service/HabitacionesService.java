package com.cibertec.service;

import java.util.List;

import com.cibertec.modelo.Habitacion;

public interface HabitacionesService {
	
	 List<Habitacion> obtenerTodos();
	 Habitacion obtenerPorId(Integer id);
	 void guardarHabitacion(Habitacion habitacion);

}
