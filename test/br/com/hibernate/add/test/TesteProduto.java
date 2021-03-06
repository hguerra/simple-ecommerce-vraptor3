package br.com.hibernate.add.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.hibernate.util.HibernateUtil;
import br.com.modelo.Categoria;
import br.com.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			Produto produto = new Produto("Camiseta", "Super Heroi", 35.0, Categoria.ADULTO_MASCULINO);
			session.save(produto);
			
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
