package br.com.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MENSAGEM")
public class Mensagem implements Comparable<Mensagem> {
	@Id
	@GeneratedValue
	@Column(name = "MENSAGEM_ID", updatable = false, nullable = false)
	private Long id;

	@Column(name = "MENSAGEM_DATA")
	private String data;

	@Column(name = "MENSAGEM_CORPO")
	private String mensagem;

	@Column(name = "MENSAGEM_DESTINATARIO_ID")
	private String destinatarioId;

	@Column(name = "MENSAGEM_USUARIO_ID")
	private String usuarioId;

	public Mensagem(String mensagem, String usuarioId, String destinatarioId) {
		this.data = dataCriacao();
		this.mensagem = mensagem;
		this.usuarioId = usuarioId;
		this.destinatarioId = destinatarioId;
	}

	public Mensagem() {

	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getDestinatarioId() {
		return destinatarioId;
	}

	public void setDestinatarioId(String destinatarioId) {
		this.destinatarioId = destinatarioId;
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

	@Override
	public int compareTo(Mensagem o) {
		return this.getData().compareTo(o.getData());
	}
}
