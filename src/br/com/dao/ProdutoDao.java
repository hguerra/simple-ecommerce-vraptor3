package br.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Produto;

@Component
public class ProdutoDao {
	private Session session;

	public ProdutoDao() {
		this.session = HibernateUtil.getSession();
	}

	public void salvar(Object object) {
		Transaction tx = session.beginTransaction();
		session.save(object);
		tx.commit();
	}

	@SuppressWarnings("rawtypes")
	public List buscar(Object object) {
		List lista = session.createCriteria(object.getClass()).add(Example.create(object)).list();
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listaTudo() {
		return this.session.createCriteria(Produto.class).list();
	}

}
