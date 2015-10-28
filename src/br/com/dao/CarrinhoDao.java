package br.com.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Carrinho;
import br.com.modelo.Compras;
import br.com.modelo.Item;
import br.com.modelo.Usuario;
import br.com.modelo.UsuarioWeb;

@Component
public class CarrinhoDao {
	private final Session session;
	private final UsuarioWeb usuario;

	public CarrinhoDao(Session session, UsuarioWeb usuario) {
		this.session = session;
		this.usuario = usuario;
	}
	
	public void finalizarCompra(Carrinho carrinho){
		Set<Item> itens = new HashSet<Item>(carrinho.getItens());
		Compras compras = new Compras(carrinho.getTotal(), itens);
		
		Usuario atualizarAtributos = usuario.getUsuario();
		
		atualizarAtributos.getCompras().add(compras);
		
		Transaction tx = session.beginTransaction();
		
		session.save(compras);
		
		this.session.save(compras);
		
		this.session.update(atualizarAtributos);
		
		tx.commit();
	}
	
	
}
