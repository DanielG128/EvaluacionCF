package com.cibertec.service;

import java.util.List;

import com.cibertec.modelo.Usuario;

public interface UsuarioService {
	
	List<Usuario> obtenerTodas();
	Usuario obtenerPorId(Integer id);
	void guardarUsuario(Usuario usuario);

}
