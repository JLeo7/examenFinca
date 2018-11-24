package com.cenfotec.examen2.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTORES")
public class Productor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "PROVINCIA", columnDefinition = "default 'San José'")
	private String provincia;
	
	@Column(name = "CANTON")
	private String canton;
	
	@Column(name = "DISTRITO")
	private String distrito;
	
	@Column(name = "CEDULA")
	private String cedula;
	
	@Column(name = "EMPRESA")
	private String empresa;
	
	public Productor() {
	}

	

	public Productor(String nombre, String direccion, String provincia, String canton, String distrito,
			String cedula, String empresa) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.provincia = provincia;
		this.canton = canton;
		this.distrito = distrito;
		this.cedula = cedula;
		this.empresa = empresa;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public String getCanton() {
		return canton;
	}



	public void setCanton(String canton) {
		this.canton = canton;
	}



	public String getDistrito() {
		return distrito;
	}



	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
