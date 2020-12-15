package com.loja.eletro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.eletro.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
