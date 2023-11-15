package com.futshop.futshop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class UsuarioModel implements UserDetails {
    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;

    @Column(length = 10, nullable = false)
    private Boolean admin = false;

    @Column(length = 20, nullable = false)
    private String role = "ROLE_USER";

    @Column(length = 80, nullable = false)
    private String nome;

    @Column(length = 16, nullable = false)
    private String dataNascimento;

    @Column(length = 20, nullable = false)
    private String cpf;

    @Column(length = 80, nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(length = 15, nullable = false)
    private String celular;

    @Column(length = 10, nullable = false)
    private String cep;

    @Column(length = 3, nullable = false)
    private String estado;

    @Column(length = 50, nullable = false)
    private String cidade;

    @Column(length = 50, nullable = false)
    private String bairro;

    @Column(length = 100, nullable = false)
    private String rua;

    @Column(length = 8, nullable = false)
    private Integer numero;

    @Column(length = 80)
    private String complemento;

    @ElementCollection
    private List<CarrinhoUsuarioModel> itens = null;

    @Column(length = 5, nullable = false)
    private Integer quantidadeItens = 0;

    @Column(length = 10, nullable = false)
    private Double valorTotalItens = 0.0;

    
    
    
    
    
    
    
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



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
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



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
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



	public void setItens(CarrinhoUsuarioModel item) {
        this.itens.add(item);
    }
    
    

    public List<CarrinhoUsuarioModel> getItens() {
		return itens;
	}



	public void setItens(List<CarrinhoUsuarioModel> itens) {
		this.itens = itens;
	}



	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    
    
    
    
    
}