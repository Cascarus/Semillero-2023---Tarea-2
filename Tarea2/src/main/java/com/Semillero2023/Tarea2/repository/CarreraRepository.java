package com.Semillero2023.Tarea2.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Semillero2023.Tarea2.entity.Carrera;

@Repository("CarreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Serializable>{
	
}
