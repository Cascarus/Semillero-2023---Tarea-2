package com.Semillero2023.Tarea2.entity;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTUDIANTE")
@DynamicUpdate @DynamicInsert
public class Estudiante implements Serializable{

	private static final long serialVersionUID = 348495951197852689L;
	
	@Id
	@Column(name="CARNE")
	private Integer carne;

	@Column(name="NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "IDCARRERA")
	private Carrera idCarrera;

	public Integer getCarne() {
		return carne;
	}

	public void setCarne(Integer carne) {
		this.carne = carne;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(Carrera idCarrera) {
		this.idCarrera = idCarrera;
	}
	
	
	
}
