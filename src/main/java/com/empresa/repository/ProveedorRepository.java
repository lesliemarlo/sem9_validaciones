package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
	
	////1. VALIDACION NOMBRE Y DNI
	@Query("select x from Proveedor x where x.nombre = ?1 and x.dni !=?2")
	public List<Proveedor> listaPorNombreDniIgualRegistra(String nombre,String dni);
	

}
