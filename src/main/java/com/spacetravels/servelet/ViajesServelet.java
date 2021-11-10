package com.spacetravels.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.spacetravels.travels.ws.Viajes;
import com.spacetravels.travels.ws.ViajesWS;
import com.spacetravels.travels.ws.ViajesWSImplService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viajesServelet")
public class ViajesServelet extends HttpServlet {

	private static final long serialVersionUID = -849026173943590726L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//System.out.println("Entro al servelt");
		Gson gson = new Gson();
		ViajesWS wsClient = new ViajesWSImplService().getViajesWSImplPort();
		
		List<Viajes> lstViajes = wsClient.obtenerTodosViajes();
		
		List<String> viajeJson = new ArrayList<String>();


		for (Viajes viajes : lstViajes) {

			viajeJson.add(gson.toJson(viajes));
		}

		String listaGson = gson.toJson(viajeJson);

		PrintWriter out = resp.getWriter();
		out.println(listaGson);
		out.flush();
		out.close();

	}

}
