package com.farmacia.Farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Farmacia.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
