package com.farmacia.Farmacia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.farmacia.Farmacia.models.Categoria;
import com.farmacia.Farmacia.models.Produto;
import com.farmacia.Farmacia.repository.CategoriaRepository;
import com.farmacia.Farmacia.repository.ProdutoRepository;

@SpringBootApplication
public class FarmaciaApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository repositoryC;
	@Autowired
	private ProdutoRepository repositoryP;

	public static void main(String[] args) {
		SpringApplication.run(FarmaciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto1 = new Produto("Axe",20.00);
		Produto produto2 = new Produto("Rexona",30.00);
		
		Categoria categoria1 = new Categoria("Perfumaria",true);
		
		repositoryC.save(categoria1);
		
		Optional<Categoria> cat = repositoryC.findById((long) 1);
		
		produto1.setCategoria(cat.get());
		produto2.setCategoria(cat.get());
		
		repositoryP.save(produto1);
		repositoryP.save(produto2);
		
		
	}

}
