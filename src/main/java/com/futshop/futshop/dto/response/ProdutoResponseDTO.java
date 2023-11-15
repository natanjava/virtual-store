package com.futshop.futshop.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoResponseDTO {

    private Long codigo;
    private String nomeProduto;
    private String imagem;
    private String descricao;
    private String tipo;
    private Integer promocao;
    private Integer quantidadeEstoque;
    private String tamanho;
    private Double valorBase;
    private Double valorComDesconto;
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
