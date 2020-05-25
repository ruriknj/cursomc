package com.rurik.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rurik.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepossitory extends JpaRepository<Categoria, Integer> {

}
