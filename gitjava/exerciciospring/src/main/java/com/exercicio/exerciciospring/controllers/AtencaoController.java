package com.exercicio.exerciciospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atencaodetalhe")
public class AtencaoController {

	@GetMapping
	public String atencaoDetalhes() {

		return "Atenção aos Detalhes para poder aprender e aplicar o que aprendeu";
	}
}
