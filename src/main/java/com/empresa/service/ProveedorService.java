package com.empresa.service;

import java.util.List;

import com.empresa.entity.Proveedor;

public interface ProveedorService {

	public abstract Proveedor insertaProveedor(Proveedor obj);
	//2.validavciones semana 9
		//este para elregistrar
		public abstract List<Proveedor> listaPorNombreDniIgualRegistra(String nombre, String dni);
	
}
