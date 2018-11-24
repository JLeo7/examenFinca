package com.cenfotec.examen2.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FINCAS")
public class Finca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ID_PRODUCTOR")
	private Long idProductor;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "NUM_PROPIEDAD")
	private String numPropiedad;
	
	public Finca() {
	}

	public Finca(Long idProductor, String nombre, String numPropiedad) {
		this.idProductor = idProductor;
		this.nombre = nombre;
		this.numPropiedad = numPropiedad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProductor() {
		return idProductor;
	}

	public void setIdProductor(Long idProductor) {
		this.idProductor = idProductor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumPropiedad() {
		return numPropiedad;
	}

	public void setNumPropiedad(String numPropiedad) {
		this.numPropiedad = numPropiedad;
	}
	
	
}
