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
@Table(name = "ITEM")
public class Item {
	@Id
	@GeneratedValue
	@Column(name = "ITEM_ID", updatable=false, nullable=false)
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "ITEM_PRODUTO", joinColumns = { @JoinColumn(name = "ITEM_ID") }, inverseJoinColumns = { @JoinColumn(name = "PRODUTO_ID") })
	private Produto produto;
	
	@Column(name = "ITEM_QUANTIDADE")
	private Integer quantidade;

	public Item(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Item() {
		
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
