package br.com.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
@Access(AccessType.FIELD)
public class Produto {
	@Id
	@Column(name = "PRODUTO_ID", updatable=false, nullable=false)
	@GeneratedValue
	private Long id;

	@Column(name = "PRODUTO_NOME")
	private String nome;

	@Column(name = "PRODUTO_DESCRICAO")
	private String descricao;

	@Column(name = "PRODUTO_PRECO")
	private Double preco;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "PRODUTO_CATEGORIA")
	private Categoria categoria;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Comentario.class)
    @JoinTable(name = "PRODUTO_COMENTARIOS", joinColumns = { @JoinColumn(name = "PRODUTO_ID") }, inverseJoinColumns = { @JoinColumn(name = "COMENTARIO_ID") })
	private Set<Comentario> comentarios = new HashSet<Comentario>(0);

	public Produto(String nome, String descricao, Double preco,
			Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public Produto() {

	}
		
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}