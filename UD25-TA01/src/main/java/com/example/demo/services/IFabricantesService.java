package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Fabricantes;

public interface IFabricantesService {
	//Métodos del CRUD
	
	public List<Fabricantes> listarFabricantes(); //Listar ALL
	public Fabricantes guardarFabricantes(Fabricantes fabricantes); //Guardar
	public Fabricantes fabricantesXID (Long id); //Leer datos de un cliente READ
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes); //UPDATE
	public void eliminarFabricantes (Long id); //DELETE
	
	
}
