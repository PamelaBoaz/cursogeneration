package com.escola.minhaescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.escola.minhaescola.models.Turma;
import com.escola.minhaescola.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {
	@Autowired
	private TurmaRepository repository;

	//@GetMapping
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Turma>> GetAll() {
		return ResponseEntity.ok(repository.findAll());

	}

	//@GetMapping("/{id}")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Turma> GetById(@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	//@PostMapping
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Turma> post(@RequestBody Turma turma) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));

	}

	//@PostMapping
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<Turma> put(@RequestBody Turma turma) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(turma));
	}

	//@DeleteMapping("/{id}")
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}