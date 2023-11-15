package com.futshop.futshop.dto.response;

import com.futshop.futshop.model.CarrinhoUsuarioModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CarrinhoResponseDTO {

    private List<CarrinhoUsuarioModel> itens;
    private Integer quantidadeItens;
    private Double valorTotalItens;
	
    
    public List<CarrinhoUsuarioModel> getItens() {
		return itens;
	}
	public void setItens(List<CarrinhoUsuarioModel> itens) {
		this.itens = itens;
	}
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	public Double getValorTotalItens() {
		return valorTotalItens;
	}
	public void setValorTotalItens(Double valorTotalItens) {
		this.valorTotalItens = valorTotalItens;
	}
    
    
}
