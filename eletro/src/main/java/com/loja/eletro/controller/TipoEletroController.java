package com.loja.eletro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.loja.eletro.model.TipoEletro;
import com.loja.eletro.repository.TipoEletroRepository;

@RestController
@RequestMapping("/tipos")
@CrossOrigin("*")
public class TipoEletroController {

	@Autowired
	public TipoEletroRepository repository;

	@GetMapping
	public ResponseEntity<List<TipoEletro>> findAllTipoEletro() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<TipoEletro> findByIdTipoEletro(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<TipoEletro> post(@RequestBody TipoEletro tipoEletro) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tipoEletro));
	}

	@PutMapping
	public ResponseEntity<TipoEletro> put(@RequestBody TipoEletro tipoEletro) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tipoEletro));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
