$(document).ready(function() {
	$("#form-login").submit(function(event) {
		event.preventDefault();

		loginUsuario();
	})

})

function loginUsuario(){
	
	let usuario = $("#usuario").val();
	let contrasena = $( "#contrasena").val();
	
	console.log("Usuario: " + usuario);
	console.log("contraseña: " + contrasena)
	
	$.ajax({
		type:"GET",
		dataType:"html",
		url:"./loginServelet",
		data: $.param({
			usuario: usuario,
			contrasena: contrasena
		}),
		
		success: function(result){
			
			let parseJson = JSON.parse(result);
			
			if(parseJson == null){
				console.log("fallo la autenticacion");
				$("#usuario-incorrecto").removeClass("d-none");
			}else{
				console.log("Login Exitoso");
				$("#usuario-correcto").removeClass("d-none");
				console.log("ParseLog" + parseJson);
				
				let nombre = parseJson['nombre'];
				let apellido = parseJson['apellidos'];
				
				console.log("Nombre: " + nombre);
	            console.log("Apellidos: " + apellido);
				document.location.href = "home.html";
			}
			
		}
	})
}