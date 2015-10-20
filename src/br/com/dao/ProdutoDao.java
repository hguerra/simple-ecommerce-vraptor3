package br.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Produto;

@Component
public class ProdutoDao {
	private final Session session;

	public ProdutoDao(Session session) {
		this.session = session;
	}

	public void salva(Object object) {
		Transaction tx = session.beginTransaction();
		session.save(object);
		tx.commit();
	}

	@SuppressWarnings("rawtypes")
	public List buscar(Object object) {
		List lista = session.createCriteria(object.getClass())
				.add(Example.create(object)).list();
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listaTudo() {
		return this.session.createCriteria(Produto.class).list();
	}

	public Produto carrega(Long id) {
		return (Produto) this.session.get(Produto.class, id);
	}

	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.update(produto);
		tx.commit();
	}

	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		this.session.delete(produto);
		tx.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> busca(String nome) {
		return (List<Produto>)session.createCriteria(Produto.class)
				.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE))
				.list();
	}

	public void recarrega(Produto produto) {
		session.refresh(produto);
	}

}
