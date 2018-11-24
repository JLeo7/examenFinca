package com.cenfotec.examen2.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAFES")
public class Cafe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ID_FINCA")
	private Long idFinca;
	
	@Column(name = "VARIEDAD")
	private String variedad;

	public Cafe() {
	}

	public Cafe(Long idFinca, String variedad) {
		this.idFinca = idFinca;
		this.variedad = variedad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdFinca() {
		return idFinca;
	}

	public void setIdFinca(Long idFinca) {
		this.idFinca = idFinca;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}
	
	
}