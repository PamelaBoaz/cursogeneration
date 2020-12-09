package com.escola.minhaescola.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(schema = "turma")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@NotNull
	@Column(name="turma")
	private String turma;

	@NotNull
	@Column(name="ativo")
	private boolean ativo;
		
	public Turma() {
		super();
	}

	public Turma(long id, String turma, boolean ativo) {
		super();
		this.id = id;
		this.turma = turma;
		this.ativo = ativo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Turma [id=" + id + ", turma=" + turma + ", ativo=" + ativo + "]";
	}
	
	

}
