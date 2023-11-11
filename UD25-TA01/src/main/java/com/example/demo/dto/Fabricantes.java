package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="fabricantes")
public class Fabricantes {
	//Atributos de la entidad fabricante
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca último valor e incrementa desde la id final del db
	private Long id;
	@Column(name = "nombre")
	private String nombre;


	@OneToMany
	@JoinColumn(name = "id")
	private List <Articulos> articulos;

	//Constructores
	public Fabricantes() {

	}
	public Fabricantes(Long id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
	//Getters y setters:
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//return articulos
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "Articulos")
	public List<Articulos> getArticulos(){
		return articulos;
	}
	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
	//Método impresión de datos por consola
	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
