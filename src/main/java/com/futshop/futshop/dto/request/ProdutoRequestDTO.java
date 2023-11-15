package com.futshop.futshop.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoRequestDTO {

    private Long codigo;
    private String nomeProduto;
    private String descricao;
    private String imagem;
    private String tipo;
    private Integer promocao;
    private Integer quantidadeEstoque;
    private String tamanho;
    private Double valorBase;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
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
    
    
}
