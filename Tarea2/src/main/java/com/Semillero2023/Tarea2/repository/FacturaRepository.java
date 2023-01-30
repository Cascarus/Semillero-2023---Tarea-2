package com.Semillero2023.Tarea2.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Semillero2023.Tarea2.entity.Factura;

@Repository("FacturaRepository")
public interface FacturaRepository extends CrudRepository<Factura, Serializable>{
	
	public List<Factura> findByTotalGreaterThanEqualOrderByTotalDesc(Double total);
	
	public List<Factura> findByFechaAfter(Date Fecha);
}
