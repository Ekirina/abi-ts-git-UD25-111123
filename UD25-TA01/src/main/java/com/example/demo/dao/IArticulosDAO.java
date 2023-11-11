package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long>{

}
