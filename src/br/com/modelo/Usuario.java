package br.com.modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {
	@Id
	@Column(name = "USUARIO_ID", updatable = false, nullable = false)
	private String login;

	@Column(name = "USUARIO_SENHA")
	private String senha;

	@Column(name = "USUARIO_NOME")
	private String nome;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USUARIO_COMPRAS", joinColumns = { @JoinColumn(name = "USUARIO_ID") }, inverseJoinColumns = { @JoinColumn(name = "COMPRAS_ID") })
	private Set<Compras> compras = new HashSet<Compras>(0);

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USUARIO_VENDAS", joinColumns = { @JoinColumn(name = "USUARIO_ID") }, inverseJoinColumns = { @JoinColumn(name = "COMPRAS_ID") })
	private Set<Compras> vendas = new HashSet<Compras>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USUARIO_MENSAGENS_ENVIADAS", joinColumns = { @JoinColumn(name = "USUARIO_ID") }, inverseJoinColumns = { @JoinColumn(name = "MENSAGEM_ID") })
	private Set<Mensagem> mensagensEnviadas = new HashSet<Mensagem>(0);
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USUARIO_MENSAGENS_RECEBIDAS", joinColumns = { @JoinColumn(name = "USUARIO_ID") }, inverseJoinColumns = { @JoinColumn(name = "MENSAGEM_ID") })
	private Set<Mensagem> mensagensRecebidas = new HashSet<Mensagem>(0);
	
	
	public Set<Mensagem> getMensagensEnviadas() {
		return mensagensEnviadas;
	}

	public void setMensagensEnviadas(Set<Mensagem> mensagensEnviadas) {
		this.mensagensEnviadas = mensagensEnviadas;
	}

	public Set<Mensagem> getMensagensRecebidas() {
		return mensagensRecebidas;
	}

	public void setMensagensRecebidas(Set<Mensagem> mensagensRecebidas) {
		this.mensagensRecebidas = mensagensRecebidas;
	}

	public Set<Compras> getCompras() {
		return compras;
	}

	public void setCompras(Set<Compras> compras) {
		this.compras = compras;
	}

	public Set<Compras> getVendas() {
		return vendas;
	}

	public void setVendas(Set<Compras> vendas) {
		this.vendas = vendas;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
