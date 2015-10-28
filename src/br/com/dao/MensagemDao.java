package br.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Mensagem;
import br.com.modelo.UsuarioWeb;
@Component
public class MensagemDao {
	private final Session session;
	private final UsuarioWeb usuario;

	public MensagemDao(Session session, UsuarioWeb usuario) {
		this.session = session;
		this.usuario = usuario;
	}

	public void enviarMensagem(Mensagem mensagem) {
		Transaction tx = session.beginTransaction();
		session.save(mensagem);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Mensagem> listarTodasEnviadas() {
		return (List<Mensagem>) this.session.createCriteria(Mensagem.class)
				.add(Restrictions.eq("usuarioId", usuario.getUsuario().getLogin())).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Mensagem> listarTodasRecebidas() {
		return (List<Mensagem>) this.session.createCriteria(Mensagem.class)
				.add(Restrictions.eq("destinatarioId", usuario.getUsuario().getLogin())).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Mensagem> listarEnviadas(String destinarioId) {
		return (List<Mensagem>) this.session.createCriteria(Mensagem.class)
				.add(Restrictions.eq("usuarioId", usuario.getUsuario().getLogin()))
				.add(Restrictions.eq("destinatarioId", destinarioId)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Mensagem> listarTodasRecebidas(String usuarioId) {
		return (List<Mensagem>) this.session.createCriteria(Mensagem.class)
				.add(Restrictions.eq("destinatarioId", usuario.getUsuario().getLogin()))
				.add(Restrictions.eq("usuarioId", usuarioId)).list();
	}

}
