package br.com.controle;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.dao.ProdutoDao;
import br.com.modelo.Produto;

@Resource
public class ProdutosController {
	private ProdutoDao dao;

	public ProdutosController(ProdutoDao dao) {
		this.dao = dao;
	}
	
	public List<Produto> lista(){
		return dao.listaTudo();
	}
}
