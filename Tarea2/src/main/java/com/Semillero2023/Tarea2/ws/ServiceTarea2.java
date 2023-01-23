package com.Semillero2023.Tarea2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Semillero2023.Tarea2.entity.Bitacora;
import com.Semillero2023.Tarea2.entity.Carrera;
import com.Semillero2023.Tarea2.entity.Estudiante;
import com.Semillero2023.Tarea2.entity.Factura;
import com.Semillero2023.Tarea2.entity.Usuario;
import com.Semillero2023.Tarea2.repository.BitacoraRepository;
import com.Semillero2023.Tarea2.repository.CarreraRepository;
import com.Semillero2023.Tarea2.repository.EstudianteRepository;
import com.Semillero2023.Tarea2.repository.FacturaRepository;
import com.Semillero2023.Tarea2.repository.UsuarioRepository;
import com.Semillero2023.Tarea2.wsint.ServicioTarea2Int;

@Component
public class ServiceTarea2 implements ServicioTarea2Int{

	@Autowired
	BitacoraRepository bitacoraRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	FacturaRepository facturaRepository;
	
	@Autowired
	CarreraRepository carreraRepository;
	
	@Autowired
	EstudianteRepository estudianteRepository;
	
	@Override
	public String test() {
		return "todo bien";
	}
	
	@Override
	public List<Bitacora> getBitacora() {
		// TODO Auto-generated method stub
		return bitacoraRepository.findAll();
	}

	@Override
	public Bitacora postBitacora(Bitacora bitacora) {
		// TODO Auto-generated method stub
		return bitacoraRepository.save(bitacora);
	}

	@Override
	public List<Usuario> getUsuario() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public Usuario postUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Factura> getFactura() {
		// TODO Auto-generated method stub
		return (List<Factura>) facturaRepository.findAll();
	}

	@Override
	public Factura postFactura(Factura factura) {
		// TODO Auto-generated method stub
		return facturaRepository.save(factura);
	}

	@Override
	public List<Carrera> getCarrera() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}

	@Override
	public Carrera postCarrera(Carrera carrera) {
		// TODO Auto-generated method stub
		return carreraRepository.save(carrera);
	}

	@Override
	public List<Estudiante> getEstudiante() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante postEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudianteRepository.save(estudiante);
	}
}
