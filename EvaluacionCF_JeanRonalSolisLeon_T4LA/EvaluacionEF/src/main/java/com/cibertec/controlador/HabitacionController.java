package com.cibertec.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.service.HabitacionesService;

@Controller
public class HabitacionController {

	@Autowired
	private HabitacionesService habitacionesService;

	@GetMapping("/catalogo")
    public String mostrarCatalogo(Model model) {
        model.addAttribute("habitaciones", habitacionesService.obtenerTodos());
        return "catalogo";
    }
	
}
