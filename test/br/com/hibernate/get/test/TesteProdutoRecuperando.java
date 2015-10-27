package br.com.hibernate.get.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.hibernate.util.HibernateUtil;
import br.com.modelo.Comentario;
import br.com.modelo.Produto;

public class TesteProdutoRecuperando {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			@SuppressWarnings("unchecked")
			List<Produto> produtoList = session.createQuery("FROM Produto")
					.list();

			System.out.println("List size: " + (produtoList).size());
			
			for (Iterator iterator = produtoList.iterator(); iterator.hasNext();) {

				Produto produto = (Produto) iterator.next();

				Set<Comentario> ph = new HashSet<Comentario>();
				
				ph = produto.getComentarios();
				
				System.out.println("***************************");
				System.out.println("Nome:" + produto.getNome());
				System.out.println("Descricao:" + produto.getDescricao());
				System.out.println("Preco:" + produto.getPreco());
				System.out.println("Categoria:" + produto.getCategoria());
				
				System.out.println("********Comentarios********");
				
				for (Comentario p : ph) {
					System.out.println("***************************");
					System.out.println("Comentario nome: " +p.getNome());
					System.out.println("Comentario nota: " + p.getNota());
					System.out.println("Comentario:" + p.getComentario());
					System.out.println("***************************");
				}
			}

			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
		} finally {
			session.close();
		}
	}
}
