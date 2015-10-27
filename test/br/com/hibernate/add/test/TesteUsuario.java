package br.com.hibernate.add.test;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.hibernate.util.HibernateUtil;
import br.com.modelo.Categoria;
import br.com.modelo.Compras;
import br.com.modelo.Item;
import br.com.modelo.Mensagem;
import br.com.modelo.Produto;
import br.com.modelo.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			Item item = new Item(new Produto("Camiseta", "Camisa social", 50.0,
					Categoria.ADULTO_FEMININO), 2);
			
			Item item2 = new Item(new Produto("Camiseta", "Camisa social", 50.0,
					Categoria.ADULTO_FEMININO), 2);

			Compras compras = new Compras();

			compras.setTotal(100.0);

			compras.getItens().add(item);

			Compras vendas = new Compras();

			vendas.setTotal(100.0);

			vendas.getItens().add(item2);

			Usuario usuario = new Usuario();

			usuario.setLogin("isa");
			usuario.setNome("isabela");
			usuario.setSenha("teste");
			usuario.getCompras().add(compras);
			usuario.getVendas().add(vendas);

			Usuario destinatario = new Usuario();

			destinatario.setLogin("hguerra");
			destinatario.setNome("heitor");
			destinatario.setSenha("teste");
			
			Mensagem mensagem = new Mensagem("OLA MUNDO", usuario.getLogin(), destinatario.getLogin());
			
			
			usuario.getMensagensEnviadas().add(mensagem);
			
			destinatario.getMensagensRecebidas().add(mensagem);

			session.save(usuario);
			
			session.save(destinatario);

			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
