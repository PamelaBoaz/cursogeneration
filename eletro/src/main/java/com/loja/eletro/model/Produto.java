package com.loja.eletro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private Double preco;
	@NotNull
	private Double quantidade;
	@NotNull
	private String marca;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private TipoEletro tipoEletro;
	
	public Produto() {

	}
	
	public Produto(@NotNull String nome, @NotNull Double preco, @NotNull Double quantidade, @NotNull String marca) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.marca = marca;
	}

	public Produto(Long id, @NotNull String nome, @NotNull Double preco, @NotNull Double quantidade,
			@NotNull String marca) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.marca = marca;
	}

	public TipoEletro getTipoEletro() {
		return tipoEletro;
	}

	public void setTipoEletro(TipoEletro tipoEletro) {
		this.tipoEletro = tipoEletro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
