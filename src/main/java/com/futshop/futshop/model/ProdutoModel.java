package com.futshop.futshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String nomeProduto;

    @Column
    private String imagem;

    @Column(length = 400, nullable = false)
    private String descricao;

    @Column(length = 50, nullable = false)
    private String tipo;

    @Column(length = 3, nullable = false)
    private Integer promocao;

    @Column(length = 5, nullable = false)
    private Integer quantidadeEstoque;

    @Column(length = 5, nullable = false)
    private String tamanho;

    @Column(length = 10, nullable = false)
    private Double valorBase;

    @Column(length = 10, nullable = false)
    private Double valorComDesconto;

    @Column(length = 50, nullable = false)
    private String dataPostagem;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPromocao() {
		return promocao;
	}

	public void setPromocao(Integer promocao) {
		this.promocao = promocao;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getValorBase() {
		return valorBase;
	}

	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}

	public Double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(Double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	public String getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(String dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
    
    
    
    
    
    
}
