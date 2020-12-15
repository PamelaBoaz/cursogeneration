package com.loja.eletro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.eletro.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findByPrecoBetween(double precoIni, double precoFim);

	public List<Produto> findByTipoEletroIdAndPrecoLessThanEqual(long id, double preco);

} 
