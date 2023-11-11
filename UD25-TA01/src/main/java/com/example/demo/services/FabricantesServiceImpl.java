package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricantesDAO;
import com.example.demo.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService{
	//Utilizamos los métodos de la interface IFabricantesDAO
	@Autowired
	IFabricantesDAO iFabricantesDAO;

	@Override
	public List<Fabricantes> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return  iFabricantesDAO.save(fabricantes);
	}

	@Override
	public Fabricantes fabricantesXID(Long id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricantes);
	}

	@Override
	public void eliminarFabricantes(Long id) {
		iFabricantesDAO.deleteById(id);		
	}
	

}
