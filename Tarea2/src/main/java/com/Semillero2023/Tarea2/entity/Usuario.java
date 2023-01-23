package com.Semillero2023.Tarea2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="USUARIO")
@DynamicUpdate @DynamicInsert
public class Usuario implements Serializable{

	private static final long serialVersionUID = 8116638009157566696L;
	
	@Id
	@Basic(optional = false)
	@Column(name="NIT")
	private Integer nit;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@OneToMany(mappedBy ="nit", fetch = FetchType.LAZY)
	private List<Factura> facturas = new ArrayList<>();
	
	public Usuario() {
		
	}
	
	public Usuario(Integer nit, String nombre, String telefono) {
		this.nit = nit;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
}