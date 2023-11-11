package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Articulos;


public interface IArticulosService {
	//Métodos del CRUD
	public List<Articulos> listarArticulos(); //Listar ALL
	public Articulos guardarArticulos(Articulos articulos); //Guardar
	public Articulos articulosXID (Long id); //Leer datos de un cliente READ
	public Articulos actualizarArticulos(Articulos articulos); //UPDATE
	public void eliminarArticulos (Long id); //DELETE
}
