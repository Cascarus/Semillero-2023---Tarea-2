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
@Table(name="FACTURA")
@DynamicUpdate @DynamicInsert
public class Factura implements Serializable{

	private static final long serialVersionUID = -9135020758040214545L;
	
	@Id
	@Basic(optional = false)
	@Column(name="NOFACTURA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer noFactura;
	
	/*@ManyToOne
	@JoinColumn(name="NIT", nullable = false)*/
	@Column(name="NIT")
	private Integer nit;
	
	@Column(name="FECHA")
	private String fecha;
	
	@Column(name="TOTAL")
	private Double total;

	public Integer getNoFactura() {
		return noFactura;
	}

	public void setNoFactura(Integer noFactura) {
		this.noFactura = noFactura;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
}
