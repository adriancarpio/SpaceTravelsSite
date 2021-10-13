package com.spacetravels.servelet;

import java.io.IOException;
import java.util.logging.Logger;

import com.spacetravels.dao.UsuarioDAO;
import com.spacetravels.dao.impl.UsuarioDAOImpl;
import com.spacetravels.model.Usuario;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CreateAccountServelet")
public class CreateAccountServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 420038382057560014L;

	private static final Logger LOG = Logger.getLogger(CreateAccountServelet.class.getName());

	private UsuarioDAO usuarioDAO;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("Access-Control-Allow-Origin", "*");
		
		usuarioDAO = new UsuarioDAOImpl();

		String nombre = req.getParameter("nombre");
		String apellidos = req.getParameter("apellidos");
		String user= req.getParameter("user");
		String password = req.getParameter("pass");
		String email = req.getParameter("email");
		String telefono = req.getParameter("telefono");
		
		Usuario usuario = new Usuario(nombre, apellidos, user, password, email, telefono);

		String jsonUsuario = usuarioDAO.registerUser(usuario);

		LOG.info("Respuesta a enviar: " + jsonUsuario);

	}

}
