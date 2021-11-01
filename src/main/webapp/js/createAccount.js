$(document).ready(function(){
	$("#form-register").submit(function(event){
		event.preventDefault();
		
		registrarNuevoUsuario();
	})
	
	$("#form-login").submit(function(event) {
		event.preventDefault();

		loginUsuario();
	})
	
})


function registrarNuevoUsuario(){
	let nombre = $("#input-nombre").val();
	let apellidos = $("#input-apellidos").val();
	let user = $("#input-usuario").val();
	let pass = $("#input-pass").val();
	let email = $("#input-email").val();
	let telefono = $("#input-telefono").val();
	
	console.log("Nombre: " + nombre);
	console.log("Apellidos: " + apellidos);
	console.log("Usuario: " + user);
	console.log("Contraseña: " + pass);
	console.log("Correo: " + email);
	console.log("Pais: "  + telefono);
	
	$.ajax({
		
		type:"POST",
		dataType:"html",
		url:"./CreateAccountServelet",
		data: $.param({
			nombre: nombre,
			apellidos: apellidos,
			user: user,
			pass: pass,
			email: email,
			telefono: telefono
		}),
		
		success: function(result){
			console.log("Envio exitoso");
			document.location.href = "index.html";
		}
		
	})
	
}