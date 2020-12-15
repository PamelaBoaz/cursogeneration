package com.loja.eletro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tipos")
public class TipoEletro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String descricao;
	@NotNull
	private Boolean ativo;

	@OneToMany(mappedBy = "tipoEletro", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tipoEletro")
	private List<Produto> listaProdutos;
	
	public TipoEletro() {

	}

	public TipoEletro(@NotNull String descricao, @NotNull Boolean ativo) {
		super();
		this.descricao = descricao;
		this.ativo = ativo;
	}

	public TipoEletro(Long id, @NotNull String descricao, @NotNull Boolean ativo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.ativo = ativo;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
