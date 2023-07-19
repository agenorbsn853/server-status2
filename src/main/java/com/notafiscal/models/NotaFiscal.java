package com.notafiscal.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotaFiscal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private long codigo;
	private String descricao;
	private long quantidadeUnit;
	private long valorUnit;
	private long valorTotal;
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getQuantidadeUnit() {
		return quantidadeUnit;
	}
	public void setQuantidadeUnit(long quantidadeUnit) {
		this.quantidadeUnit = quantidadeUnit;
	}
	public long getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(long valorUnit) {
		this.valorUnit = valorUnit;
	}
	public long getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(long valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	

}
