package br.com.controle;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.dao.ProdutoDao;
import br.com.modelo.Carrinho;
import br.com.modelo.Item;

@Resource
public class CarrinhoController {
	private final Carrinho carrinho;
	private final ProdutoDao dao;
	private final Result result;

	public CarrinhoController(Carrinho carrinho, ProdutoDao dao, Result result) {
		this.carrinho = carrinho;
		this.dao = dao;
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

}
