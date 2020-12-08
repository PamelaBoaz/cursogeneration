package com.exercicio.exerciciospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proatividade")
public class ProatividadeController {

	@GetMapping
	public String proatividade() {

		return "Proatividade para tomar atitude em tirar dúvidas e aprender mais.";
	}

}
