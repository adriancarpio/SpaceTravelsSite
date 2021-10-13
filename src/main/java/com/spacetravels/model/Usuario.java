package com.spacetravels.model;

public class Usuario {

	public String nombre;

	public String apellidos;
	
	public String usuario;
	
	public String password;
	
	public String email;

	public String telefono;
	

	public Usuario() {
		
	}


	public Usuario(String nombre, String apellidos, String usuario, String password, String email, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", usuario=" + usuario + ", password="
				+ password + ", email=" + email + ", telefono=" + telefono + "]";
	}
	

}
