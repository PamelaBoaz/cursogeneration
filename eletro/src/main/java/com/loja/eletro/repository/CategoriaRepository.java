package com.loja.eletro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.eletro.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
