package br.com.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "COMPRAS")
public class Compras {
	
	@Id
	@GeneratedValue
	@Column(name = "COMPRAS_ID", updatable=false, nullable=false)
	private Long id;
	
	@Column(name = "COMPRAS_TOTAL")
	private Double total;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "COMPRAS_ITEM", joinColumns = { @JoinColumn(name = "COMPRAS_ID") }, inverseJoinColumns = { @JoinColumn(name = "ITEM_ID") })
	private Set<Item> itens = new HashSet<Item>(0);
	
	
	public Compras(Double total, Set<Item> itens) {
		this.total = total;
		this.itens = itens;
	}
	
	public Compras() {
	
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Item> getItens() {
		return itens;
	}

	public void setItens(Set<Item> itens) {
		this.itens = itens;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
