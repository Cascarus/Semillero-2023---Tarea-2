package com.Semillero2023.Tarea2.entity;

public class CarreraEstudianteDTO {
	
	private Integer carne;
	private String nombre;
	private String carrera;
	private Double promedio;

	public CarreraEstudianteDTO(Integer carne, String nombre, String carrera, Double promedio) {
		this.carne = carne;
		this.nombre = nombre;
		this.carrera = carrera;
		this.promedio = promedio;
	}

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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	
	
}
