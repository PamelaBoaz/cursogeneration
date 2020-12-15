package com.loja.eletro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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

	public Long getId() {
		return id;
	}

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
