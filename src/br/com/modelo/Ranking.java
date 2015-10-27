package br.com.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RANKING")
public class Ranking {
	@Id
	@GeneratedValue
	@Column(name = "RANKING_ID", updatable=false, nullable=false)
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "RANKING_PRODUTO", joinColumns = { @JoinColumn(name = "RANKING_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRODUTO_ID") })
	private Produto produto;
	
	@Column(name = "RANKING_NUMERO_VENDIDOS")
	private Integer numeroVendidos;
	
	public Ranking(Produto produto, Integer numeroVendidos) {
		this.produto = produto;
		this.numeroVendidos = numeroVendidos;
	}
	
	public Ranking() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getNumeroVendidos() {
		return numeroVendidos;
	}

	public void setNumeroVendidos(Integer numeroVendidos) {
		this.numeroVendidos = numeroVendidos;
	}
}
