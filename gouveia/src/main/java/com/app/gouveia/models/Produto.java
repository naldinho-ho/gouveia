package com.app.gouveia.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 50)
	@NotEmpty(message = "O nome do produto é obrigatório")
	private String nome;
	
	@Column(nullable = false, length = 50)
	//@NotEmpty(message = "a Quantidade é obrigatória")
	private int qtdeEstoque;
	
	@Column(nullable = false, length = 50)
	//@NotEmpty(message = "O preço é obrigatório")
	
	private Double preco;
	private Double precoDesconto;
	private Double PorcentagemDesconto;
	
	@ManyToOne
	private Marca marca;
	@ManyToOne
	private Categoria categoria;

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

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(Double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	public Double getPorcentagemDesconto() {
		return PorcentagemDesconto;
	}

	public void setPorcentagemDesconto(Double porcentagemDesconto) {
		PorcentagemDesconto = porcentagemDesconto;
	}
	
}