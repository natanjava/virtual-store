package com.futshop.futshop.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDTO {
    private Long codigo;
    private String token;
    private Boolean admin;
    private String email;
    private String nome;
    private Integer quantidadeItens;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
	
    
    
    
    
    
    
    public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
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
	
	
	
	
	
	
	
    
    
}
