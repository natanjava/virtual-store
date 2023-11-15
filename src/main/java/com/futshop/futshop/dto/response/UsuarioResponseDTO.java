package com.futshop.futshop.dto.response;

import com.futshop.futshop.model.CarrinhoUsuarioModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UsuarioResponseDTO {
    private Long codigo;
    private Boolean admin;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;
    private String celular;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
    private List<CarrinhoUsuarioModel> itens;
    private Integer quantidadeItens;
    private Double valorTotalItens;
	
    
    
    
    public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
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
