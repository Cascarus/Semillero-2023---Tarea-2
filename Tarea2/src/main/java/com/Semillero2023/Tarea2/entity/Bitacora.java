package com.Semillero2023.Tarea2.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BITACORA")
@DynamicUpdate @DynamicInsert
public class Bitacora implements Serializable{
	
	private static final long serialVersionUID = 6062959361272917714L;
	
	@Id
	@Basic(optional = false)
	@Column(name="IDBITACORA")
	private Integer idBitacora;
	
	@Column(name="DETALLE")
	private String detalle;
	
	@Column(name="FECHA")
	private Date fecha;
	
	public Integer getIdBitacora() {
		return idBitacora;
	}
	public void setIdBitacora(Integer idBitacora) {
		this.idBitacora = idBitacora;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
