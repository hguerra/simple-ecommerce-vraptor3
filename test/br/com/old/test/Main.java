package br.com.old.test;

import br.com.hibernate.util.HibernateUtil;
import br.com.modelo.Categoria;
import br.com.modelo.Produto;

public class Main {

	public static void main(String[] args) {
		/**
		 * Salvar
		 */
		String nome = "Camiseta";
		String descricao = "Heroi";
		Double preco = 35.00;
		
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		produto.setCategoria(Categoria.ADULTO_MASCULINO);

		HibernateUtil.salvar(produto);
		
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
