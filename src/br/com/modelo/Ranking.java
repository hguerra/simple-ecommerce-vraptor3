package br.com.modelo;

public class Ranking {
	private Long id;
	private Produto produto;
	private Integer numeroVendidos;
	
	public Ranking(Long id, Produto produto, Integer numeroVendidos) {
		this.id = id;
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
