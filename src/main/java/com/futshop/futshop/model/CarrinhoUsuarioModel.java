package com.futshop.futshop.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class CarrinhoUsuarioModel {
    private Long codigo;
    private String imagem;
    private String descricaoProduto;
    private Integer quantidade;
    private String tamanho;
    private Double precoUnitario;
    private Double precoFinal;



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(Double precoFinal) {
		this.precoFinal = precoFinal;
	}

	/*
	 * */
    public CarrinhoUsuarioModel(Integer quantidade){
        this.quantidade = quantidade;
    }
    
    public CarrinhoUsuarioModel(){
    }
	
	public CarrinhoUsuarioModel(Long codigo, String imagem, String descricaoProduto, Integer quantidade, String tamanho,
			Double precoUnitario, Double precoFinal) {
		this.codigo = codigo;
		this.imagem = imagem;
		this.descricaoProduto = descricaoProduto;
		this.quantidade = quantidade;
		this.tamanho = tamanho;
		this.precoUnitario = precoUnitario;
		this.precoFinal = precoFinal;
	}
    
    
    
}
