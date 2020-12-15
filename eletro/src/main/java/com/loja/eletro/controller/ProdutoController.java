package com.loja.eletro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.eletro.model.Produto;
import com.loja.eletro.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	public ProdutoRepository repository;

	@GetMapping
	public ResponseEntity<List<Produto>> findAllProdutos() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/range/{valorIni}/{valorFim}")
	public ResponseEntity<List<Produto>> findByPreco(@PathVariable double valorIni, @PathVariable double valorFim) {
		return ResponseEntity.ok(repository.findByPrecoBetween(valorIni, valorFim));
	}

	@GetMapping("/tipopreco/{id}/{preco}")
	public ResponseEntity<List<Produto>> findByPrecoTipo(@PathVariable long id, @PathVariable double preco) {
		return ResponseEntity.ok(repository.findByTipoEletroIdAndPrecoLessThanEqual(id, preco));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findByIdProduto(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}

	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
