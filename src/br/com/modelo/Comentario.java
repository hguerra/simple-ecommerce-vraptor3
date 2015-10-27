package br.com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMENTARIO")
public class Comentario {
	@Id
	@Column(name = "COMENTARIO_ID", updatable=false, nullable=false)
	@GeneratedValue
	private Long id;
	
	@Column(name = "COMENTARIOS_NOME")
	private String nome;
	
	@Column(name = "COMENTARIOS_NOTA")
	private Integer nota;
	
	@Column(name = "COMENTARIOS_COMENTARIO")
	private String comentario;
	
	public Comentario(Long id, String nome, Integer nota, String comentario) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.comentario = comentario;
	}
	
	public Comentario() {
	
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

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
