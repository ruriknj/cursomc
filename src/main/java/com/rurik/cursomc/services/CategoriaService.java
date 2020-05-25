package com.rurik.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rurik.cursomc.domain.Categoria;
import com.rurik.cursomc.repositories.CategoriaRepossitory;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepossitory repo;

	public Categoria find(Integer id){
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
		
		
	}
}
