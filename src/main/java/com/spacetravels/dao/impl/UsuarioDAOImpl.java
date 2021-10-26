package com.spacetravels.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.spacetravels.dao.UsuarioDAO;
import com.spacetravels.dao.connection.MariaDBConnection;
import com.spacetravels.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private static final Logger LOG = Logger.getLogger(UsuarioDAOImpl.class.getName());

	private MariaDBConnection mariaDBConnection = new MariaDBConnection();

	Gson gson = new Gson();

	@Override
	public Usuario login(String username, String passwrod) {

		Usuario usuario = null;

		try {
			Connection connection = mariaDBConnection.getConnection();

			String sqlSelect = "SELECT  nombre , apellidos FROM usuarios  WHERE  usuario = '" + username
					+ "' AND pasword ='" + passwrod + "'";

			Statement stSelect = connection.createStatement();
			ResultSet rs = stSelect.executeQuery(sqlSelect);

			while (rs.next()) {
				usuario = new Usuario();

				usuario.nombre = rs.getString("nombre");
				usuario.apellidos = rs.getString("apellidos");
			}

			LOG.info("Usuario encontrado " + usuario);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return usuario;
	}

	@Override
	public String registerUser(Usuario usuario) {

		try {

			Connection connection = mariaDBConnection.getConnection();

			PreparedStatement statement = connection.prepareStatement(INSERT_USUARIO);

			statement.setString(1, usuario.nombre);
			statement.setString(2, usuario.apellidos);
			statement.setString(3, usuario.usuario);
			statement.setString(4, usuario.password);
			statement.setString(5, usuario.email);
			statement.setString(6, usuario.telefono);
			statement.executeUpdate();

			LOG.info("Usuario a registrar de forma exitosa: " + usuario);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		LOG.info("Usuario a registrar: " + usuario);
		return gson.toJson(usuario);

	}

}
