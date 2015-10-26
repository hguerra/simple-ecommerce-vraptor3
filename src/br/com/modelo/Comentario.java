package br.com.modelo;

public class Comentario {
	private Long id;
	private String nome;
	private Integer nota;
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
