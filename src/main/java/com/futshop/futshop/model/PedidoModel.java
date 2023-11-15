package com.futshop.futshop.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;

    @Column(length = 10, nullable = false)
    private Long codigoCliente;

    @Column(length = 10, nullable = false)
    private Long numero;

    @Column(length = 25, nullable = false)
    private String data;

    @Column(length = 30, nullable = false)
    private String status = "Aguardando confirmação";

    @Column(length = 300)
    private String motivoRejeicao;

    @Column(length = 30, nullable = false)
    private String pagamento;

    @Column(length = 3, nullable = false)
    private Integer quantidaeParcelas;

    @Column(length = 10, nullable = false)
    private Double valorParcela;

    @Column(length = 80, nullable = false)
    private String nomeCliente;

    @Column(length = 15, nullable = false)
    private String cpfCliente;

    @Column(length = 15, nullable = false)
    private String celular;

    @Column(length = 80, nullable = false)
    private String email;

    @Column(length = 250, nullable = false)
    private String endereco;

    @ElementCollection
    private List<CarrinhoPedidoModel> itens;

    @Column(length = 5, nullable = false)
    private Integer quantidadeItens;

    @Column(length = 10, nullable = false)
    private Double valor;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotivoRejeicao() {
		return motivoRejeicao;
	}

	public void setMotivoRejeicao(String motivoRejeicao) {
		this.motivoRejeicao = motivoRejeicao;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public Integer getQuantidaeParcelas() {
		return quantidaeParcelas;
	}

	public void setQuantidaeParcelas(Integer quantidaeParcelas) {
		this.quantidaeParcelas = quantidaeParcelas;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<CarrinhoPedidoModel> getItens() {
		return itens;
	}

	public void setItens(List<CarrinhoPedidoModel> itens) {
		this.itens = itens;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Integer quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public PedidoModel(Long codigo, Long codigoCliente, Long numero, String data, String status, String motivoRejeicao,
			String pagamento, Integer quantidaeParcelas, Double valorParcela, String nomeCliente, String cpfCliente,
			String celular, String email, String endereco, List<CarrinhoPedidoModel> itens, Integer quantidadeItens,
			Double valor) {
		this.codigo = codigo;
		this.codigoCliente = codigoCliente;
		this.numero = numero;
		this.data = data;
		this.status = status;
		this.motivoRejeicao = motivoRejeicao;
		this.pagamento = pagamento;
		this.quantidaeParcelas = quantidaeParcelas;
		this.valorParcela = valorParcela;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
		this.itens = itens;
		this.quantidadeItens = quantidadeItens;
		this.valor = valor;
	}
	
	
	public PedidoModel () {
		
	}
	
	
	
	
    
    
    
    
}
