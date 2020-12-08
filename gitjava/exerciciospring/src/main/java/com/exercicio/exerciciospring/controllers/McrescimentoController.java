package com.exercicio.exerciciospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mcrescimento")
public class McrescimentoController {

	@GetMapping
	public String mentalidadeCrescimento() {

		return "Mentalidade de Crescimento para buscar conhecimento.";
	}

}
