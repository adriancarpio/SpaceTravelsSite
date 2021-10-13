package com.spacetravels.dao;

import com.spacetravels.model.Usuario;

public interface UsuarioDAO {

	String INSERT_USUARIO = "INSERT INTO GINION.USUARIO\n" + "(NOMBRE, APELLIDOS, USUARIO, PASSWORD, EMAIL, TELEFONO)\n"
			+ "VALUES( ?, ?, ?, ?, ?, ?)";

	public Usuario login(String username, String passwrod);

	public String registerUser(Usuario usuario);
}
