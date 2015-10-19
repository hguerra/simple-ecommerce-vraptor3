package br.com.test;

import java.util.List;

import br.com.dao.HibernateUtil;
import br.com.dao.ProdutoDao;
import br.com.modelo.Produto;

public class Main {

	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
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
		
//		Produto p = carregarProduto(1L);
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

	public static Produto carregarProduto(Long id) {
		Produto p = (Produto) HibernateUtil.getSession().get(Produto.class, id);
		return p;
	}

}
