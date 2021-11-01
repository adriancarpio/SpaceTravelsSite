$(document).ready(function(){
	
	$(function(){
		getViajes();
	});	
});

function getViajes(){
	$.ajax({
		type: "GET",
		dataType: "html",
		url: "./viajesServelet",
		data: $.param({
			
		}),
		success: function(result){
			
			let viajesResult = JSON.parse(result);
			
			if(viajesResult != false){
				console.log("Viajes recuperados de forma exitosa ");
				console.log("Mostrando viajes");
				
				mostrarViajes(viajesResult);
				
			}else{
				console.log("Error al recuperar Viajes");
			}
			
		}
	})
}

function mostrarViajes(viajes){
	let contenido = "";
	
	$.each(viajes, function(index, viaje) {
		
		viaje = JSON.parse(viaje);
		
		contenido += '<tr><th scope="row">' + viaje.id + '</th>' +
		            '<td>' + viaje.origen + '</td>' +
                    '<td>' + viaje.destino + '</td>' +
                    '<td>' + viaje.nave + '</td>' +
					'<td>' + viaje.fecha + '</td>' +
				    '<td>' + viaje.precio + '</td>' +
					'<td>' + viaje.asientoDisponibles + '</td>' +
					'<td><button onClick="#" class="btn btn-success">Reservar Viaje</button></td>'+
					'</tr>';
		
	});
	
	$('#viajes-tbody').html(contenido);
}