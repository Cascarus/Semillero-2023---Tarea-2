package com.Semillero2023.Tarea2.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Semillero2023.Tarea2.entity.Bitacora;

@Repository("BitacoraRepository")
public interface BitacoraRepository extends JpaRepository<Bitacora, Serializable>{
	
	public List<Bitacora> findByFechaEquals(Date Fecha);
	
	
}
