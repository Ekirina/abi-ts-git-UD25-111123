package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulos {
	//Atributos de entidad Articulos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca el último valor e incrementa desde la id final de la db
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name ="precio")
	private int precio;
	//No se coloca el campo de la foreign key, se define después con el @ManyToOne
	
	@ManyToOne
	@JoinColumn(name = "codigo_fabricante")
	private Fabricantes fabricantes;
	//constructores
	public Articulos(){
		
	}
	//@param id - @param nombre - @param precio - @param codigo_fabricante
	public Articulos(Long id, String nombre, int precio, Fabricantes fabricantes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricantes = fabricantes;
	}
	//Getters y setters
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Fabricantes getFabricantes() {
		return fabricantes;
	}
	public void setFabricantes(Fabricantes fabricantes) {
		this.fabricantes = fabricantes;
	}
	//Método String
	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricantes=" + fabricantes
				+ "]";
	}
	
	
}
