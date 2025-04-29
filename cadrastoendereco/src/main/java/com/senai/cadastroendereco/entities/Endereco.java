package com.senai.cadastroendereco.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero")
	private String numero;
	
	@Column (name = "cidade")
	private String cidade;
	
	@Column (name = "estados")
	private String estados;
	
	@Column (name = "cep")
	private String cep;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	public Endereco(Long id, String rua, String numero, String cidade, String estados, String cep, Pessoa pessoa) {
		super();
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.estados = estados;
		this.cep = cep;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstados() {
		return estados;
	}

	public void setEstados(String estados) {
		this.estados = estados;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	} 
	
	

}
