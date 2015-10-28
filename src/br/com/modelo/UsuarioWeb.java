package br.com.modelo;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.interceptor.Restrito;

@Component
@SessionScoped
public class UsuarioWeb {
	private Usuario logado;

	public void login(Usuario usuario) {
		this.logado = usuario;
	}

	public String getNome() {
		return logado.getNome();
	}

	public boolean isLogado() {
		return logado != null;
	}

	public void logout() {
		this.logado = null;

	}
	
	@Restrito
	public Usuario getUsuario(){
		return logado;
	}
}
