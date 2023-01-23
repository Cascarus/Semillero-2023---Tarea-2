package com.Semillero2023.Tarea2.entity;

import java.io.Serializable;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CARRERA")
@DynamicUpdate @DynamicInsert
public class Carrera implements Serializable{

	private static final long serialVersionUID = 2418640100244585978L;
	
	@Id
	@Basic(optional = false)
	@Column(name="IDCARRERA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idCarrera;

	@Column(name="CARRERA")
	private String carrera;

	public Integer getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(Integer idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
