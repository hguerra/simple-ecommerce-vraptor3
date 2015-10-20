package br.com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.dao.ProdutoDao;
import br.com.infra.CriadorDeSession;
import br.com.infra.CriadorDeSessionFactory;
import br.com.modelo.Produto;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new CriadorDeSessionFactory().getInstance();
		Session session = new CriadorDeSession(factory).getInstance();
		ProdutoDao dao = new ProdutoDao(session);
		
		/**
		 * Salvar
		 */
		String nome = "Notebook";
		String descricao = "Gateway i5";
		Double preco = 1400.00;
		
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setPreco(preco);

		dao.salva(produto);
		
		/**
		 * Carregar todos
		 */
		// @SuppressWarnings("unchecked")
		// List<Produto> lista = (List<Produto>) dao.buscar(new Produto());
		//
		// for(Produto l: lista){
		// System.out.println("Id: "+l.getId() +" Nome: " + l.getNome());
		// }

		/**
		 * Carregar por um parametro especifico
		 */
		//
		// Produto filtroProduto = new Produto();
		// filtroProduto.setNome("mesa");
		// List<Produto> lista = (List<Produto>) dao.buscar(filtroProduto);
		//
		// for(Produto l: lista){
		// System.out.println("Id: "+l.getId() +" Nome: " + l.getNome());
		// }
		//

		/**
		 * Carregar pelo id
		 */
		
//		Produto p = dao.carrega(1L);
//		if(p!=null){
//			System.out.println(p.getNome());
//		}else{
//			System.out.println("problema");
//		}
		/**
		 * Atualizar
		 */
		// Produto filtroProduto = new Produto();
		// filtroProduto.setNome("mesa");
		// List<Produto> lista = (List<Produto>) dao.buscar(filtroProduto);
		// if (!lista.isEmpty()) {
		// Produto paraEditar = lista.get(0);
		// paraEditar.setNome("Mesa");
		// dao.atualiza(paraEditar);
		// System.out.println("produto editado!");
		// }

	}

}
