package com.farmacia.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.Farmacia.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	

}
