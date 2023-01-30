package com.Semillero2023.Tarea2.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Semillero2023.Tarea2.entity.Usuario;

@Repository("UsuarioRepository")
public interface UsuarioRepository extends CrudRepository<Usuario, Serializable>{
	
	public List<Usuario> findByCorreoLike(String correo);
	public Usuario findByNitEquals(Integer nit);
}
