package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Articulos;
import com.example.demo.services.ArticulosServiceImpl;

@RestController
@RequestMapping ("/api")
public class ArticulosController {
	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarFabricantes(@RequestBody Articulos articulos) {
		return articulosServiceImpl.guardarArticulos(articulos);
	}
	@GetMapping("/articulos/{id}")
	public Articulos fabricantesXID(@PathVariable(name="id")Long id) {
		Articulos articulos_xid = new Articulos();
		articulos_xid = articulosServiceImpl.articulosXID(id);
		System.out.println("Fabricantes XID: "+articulos_xid);
		return articulos_xid;
	}
	@PutMapping("/articulos/{id}")
	public Articulos actualizarFabricantes(@PathVariable(name="id")Long id, @RequestBody Articulos articulos) {
		Articulos articulos_seleccionado = new Articulos();
		Articulos articulos_actualizado = new Articulos();
		
		articulos_seleccionado = articulosServiceImpl.articulosXID(id);
		
		articulos_seleccionado.setNombre(articulos.getNombre());
		articulos_seleccionado.setPrecio(articulos.getPrecio());
		articulos_seleccionado.setFabricantes(articulos.getFabricantes());
		
		articulos_actualizado = articulosServiceImpl.actualizarArticulos(articulos_seleccionado);
		System.out.println("El fabricante actualizado es: "+articulos_actualizado);
		
		return articulos_actualizado;
	}
	@DeleteMapping("/articulos/{id}")
	public void eliminarFabricantes (@PathVariable(name="id")Long id) {
		articulosServiceImpl.eliminarArticulos(id);
	}
}
