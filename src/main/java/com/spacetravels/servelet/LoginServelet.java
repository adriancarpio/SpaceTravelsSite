package com.spacetravels.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.spacetravels.dao.UsuarioDAO;
import com.spacetravels.dao.impl.UsuarioDAOImpl;
import com.spacetravels.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginServelet")
public class LoginServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 547302838440531916L;

	private Logger LOG = Logger.getLogger(LoginServelet.class.getName());
	
	private UsuarioDAO usuarioDao;
	
	Gson gson = new Gson();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("Access-Control-Allow-Origin", "*");
		
		usuarioDao = new UsuarioDAOImpl();

		String usuario = req.getParameter("usuario");
		String contrasena = req.getParameter("contrasena");

		LOG.info("Usuario: " + usuario);
		LOG.info("Contraseña: " + contrasena);
		
	    Usuario usuarioResult = usuarioDao.login(usuario, contrasena);
	    
	    
	    LOG.info("Resultado: " + usuarioResult);
	    
	    resp.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = resp.getWriter();
	    out.println(gson.toJson(usuarioResult));
	    out.flush();
	    out.close();
	}


}
