package com.servicios.viajes;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.spacetravels.travels.ws.Viajes;
import com.spacetravels.travels.ws.ViajesWS;
import com.spacetravels.travels.ws.ViajesWSImplService;

class ViajesTest {

	//@Test
	void testCreaNuevoViaje() {
		ViajesWS wsClient = new ViajesWSImplService().getViajesWSImplPort();
		Viajes viajes = new Viajes();
		
		viajes.setOrigen("Planeta test");
		viajes.setDestino("Planeta JUnit");
		viajes.setAsientoDisponibles("1000");
		viajes.setFecha("10/10/2030"); 
		viajes.setPrecio("1000000");
		viajes.setNave("JUnit Nave");
		
		wsClient.crearViaje(viajes);
	}
	
	@Test
	void testConsultarViaje() {
		ViajesWS wsClient = new ViajesWSImplService().getViajesWSImplPort();
		List<Viajes> lstViajes = wsClient.obtenerTodosViajes();
		
		for (Viajes viajes : lstViajes ) {
			System.out.println(viajes);
			
		}
	}

}
