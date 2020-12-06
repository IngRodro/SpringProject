package com.unab.desarrollo.springdata.Entidad;

import java.io.Serializable;

import javax.persistence.*;




@Entity
@Table(name = "persona")
public class Persona implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_persona;
	public Long getId_persona() {
		return id_persona;
	}
	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;

}
