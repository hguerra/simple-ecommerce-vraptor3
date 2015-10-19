package br.com.controle;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.dao.ProdutoDao;
import br.com.modelo.Produto;

@Resource
public class ProdutosController {
	private final ProdutoDao dao;
	private final Result result;

	public ProdutosController(ProdutoDao dao, Result result) {
		this.dao = dao;
		this.result = result;
	}

	public List<Produto> lista() {
		return dao.listaTudo();
	}

	public void adiciona(Produto produto) {
		dao.salvar(produto);
		result.redirectTo(this).lista();
	}
	
	public void formulario() {
	}
	
	public Produto edita(Long id){
		return dao.carrega(id);
	}
	
	public void altera(Produto produto){
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}
	
	
	
}
