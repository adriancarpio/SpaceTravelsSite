package com.spacetravels.dao;

import com.spacetravels.model.Usuario;

public interface UsuarioDAO {

	String INSERT_USUARIO = "INSERT INTO space_travels.usuarios (nombre, apellidos, email, usuario, pasword, telefono)\n"
			+ "VALUES( ?, ?, ?, ?, ?, ?)";

	public Usuario login(String username, String passwrod);

	public String registerUser(Usuario usuario);
}
