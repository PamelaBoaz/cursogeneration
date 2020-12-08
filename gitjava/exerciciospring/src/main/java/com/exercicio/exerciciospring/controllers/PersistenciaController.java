package com.exercicio.exerciciospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persistencia")

public class PersistenciaController {

	@GetMapping
	public String persistencia() {
		return "Persistência para aprender o conteúdo";
	}
}
