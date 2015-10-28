package br.com.controle;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.dao.CarrinhoDao;
import br.com.dao.ProdutoDao;
import br.com.interceptor.Restrito;
import br.com.modelo.Carrinho;
import br.com.modelo.Item;
import br.com.modelo.Produto;

@Resource
public class CarrinhoController {
	private final Carrinho carrinho;
	private final ProdutoDao dao;
	private final Result result;
	private final CarrinhoDao carrinhoDao;

	public CarrinhoController(Carrinho carrinho, ProdutoDao dao,
			CarrinhoDao carrinhoDao, Result result) {
		this.carrinho = carrinho;
		this.dao = dao;
		this.carrinhoDao = carrinhoDao;
		this.result = result;
	}

	@Get("/carrinho")
	public void visualiza() {
	}

	@Post("/carrinho")
	public void adiciona(Item item) {
		dao.recarrega(item.getProduto());
		carrinho.adiciona(item);
		result.redirectTo(this).visualiza();
	}

	@Delete("/carrinho/{indiceItem}")
	public void remove(int indiceItem) {
		carrinho.remove(indiceItem);
		result.redirectTo(this).visualiza();
	}

	/**
	 * 
	 */

	@Restrito
	@Post("/carrinho/finalizar")
	public void finalizarCompra() {
		List<Item> itens = carrinho.getItens();
		for (Item i : itens) {
			Produto paraRemover = i.getProduto();
			dao.remove(paraRemover);
		}
		//carrinhoDao.finalizarCompra(carrinho);
	}

}
