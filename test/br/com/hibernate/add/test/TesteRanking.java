package br.com.hibernate.add.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.hibernate.util.HibernateUtil;
import br.com.modelo.Categoria;
import br.com.modelo.Produto;
import br.com.modelo.Ranking;

public class TesteRanking {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			Produto produto = new Produto("Camiseta", "Super Heroi", 35.0, Categoria.ADULTO_MASCULINO);
			
			Ranking ranking = new Ranking(produto, 10);
			
			session.save(ranking);
			
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
		} finally {
			session.close();
		}

	}
}
