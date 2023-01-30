package com.Semillero2023.Tarea2.entity;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ESTUDIANTE")
@DynamicUpdate @DynamicInsert
public class EstudianteV2 implements Serializable{

	private static final long serialVersionUID = 348495951197852689L;
	
	@Id
	@Column(name="CARNE")
	private Integer carne;

	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name = "IDCARRERA")
	private Integer idCarrera;
	
	@Column(name="PROMEDIO")
	private Double promedio;

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

	public Integer getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(Integer idCarrera) {
		this.idCarrera = idCarrera;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}	
	
}