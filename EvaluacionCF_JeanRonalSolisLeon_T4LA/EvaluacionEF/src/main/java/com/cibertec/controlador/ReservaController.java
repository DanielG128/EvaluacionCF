package com.cibertec.controlador;

import com.cibertec.modelo.Reserva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.repositorio.IReservaRepository;

@Controller
public class ReservaController {

	
	@Autowired
	private IReservaRepository reservaRepository;
	
	@GetMapping("/listado")
	public String listarReservas(Model model) {
		List<Reserva> reservas = reservaRepository.findAll();
		model.addAttribute("reservas", reservas);
		return "listado"; 
	}
	
	@GetMapping("/nuevo")
	public String nuevaReserva(Model model) {
		model.addAttribute("reserva", new Reserva());
		return "nuevo";
	}

	@PostMapping("/nuevo")
	public String formNuevaReserva(@ModelAttribute Reserva reserva) {
		reservaRepository.save(reserva);
		return "redirect:/listado";
	}
}
