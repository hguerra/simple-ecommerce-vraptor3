package br.com.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem {
	private Long id;
	private String data;
	private String mensagem;

	public Mensagem(Long id, String mensagem) {
		this.id = id;
		this.data = dataCriacao();
		this.mensagem = mensagem;
	}

	public Mensagem() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String dataCriacao() {
		return new SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(new Date());
	}
}
