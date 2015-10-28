package br.com.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.util.Util;
@Entity
@Table(name = "HISTORICO")
public class Historico {
	
	@Id
	@GeneratedValue
	@Column(name = "HISTORICO_ID", updatable=false, nullable=false)
	private Long id;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "HISTORICO_ACAO")
	private Acao acao;

	@Column(name = "HISTORICO_DATA")
	private String data;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "HISTORICO_PRODUTO_ATUAL", joinColumns = { @JoinColumn(name = "HISTORICO_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRODUTO_ID") })
	private Set<Produto> produtosAtual = new HashSet<Produto>(0);

	public Historico(Acao acao, Set<Produto> produtosAtual) {
		this.acao = acao;
		this.data = Util.dataCriacao();
		this.produtosAtual = produtosAtual;
		
	}

	public Historico() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Set<Produto> getProdutosAtual() {
		return produtosAtual;
	}

	public void setProdutosAtual(Set<Produto> produtosAtual) {
		this.produtosAtual = produtosAtual;
	}

}
