package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Modalidad;

public interface ModalidadService {

	public abstract Modalidad insertaModalidad(Modalidad obj);
	public abstract List<Modalidad> listaPorNombre(String nombre);
	public abstract Modalidad actualizaModalidad(Modalidad obj);
	public abstract List<Modalidad> listaPorNombreLike(String nombre);
	public abstract Optional<Modalidad> buscaModalidad(int idModalidad);
	
	public abstract List<Modalidad> buscaPorDeporteEnSede(String sede, int idDeporte);
	
	
	//2.validavciones semana 9
	//este para elregistrar
	public abstract List<Modalidad> listaPorNombreIgualRegistra(String nombre);
	public abstract List<Modalidad> listaPorNombreIgualActualiza(String nombre, int id);
}
