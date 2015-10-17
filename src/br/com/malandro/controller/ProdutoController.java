package br.com.malandro.controller;

import java.util.List;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.malandro.hibernate.HibernateUtil;
import br.com.malandro.modelo.Produto;

@Resource
public class ProdutoController {

	private Result result;
	private Validator validator;

	public ProdutoController(Result result, Validator validator) {

		this.result = result;
		this.validator = validator;
	}

	public void acessar(List<Produto> produtos) {

		if (produtos == null) {

			produtos = HibernateUtil.buscar(new Produto());
		}

		result.include("produtos", produtos);
	}

	public void pesquisar(String pesquisa) {

		Produto produtoFiltro = new Produto();
		produtoFiltro.setNome(pesquisa);

		List<Produto> produtos = HibernateUtil.buscar(produtoFiltro);

		result.redirectTo(this).acessar(produtos);
	}

	public void salvar(Produto produto) {

		if (produto.getNome() == null) {

			validator.add(new ValidationMessage("O nome do produto deve estar preenchido", "Erro"));
			validator.onErrorRedirectTo(this).acessar(null);
		}

		HibernateUtil.salvar(produto);

		result.redirectTo(this).acessar(null);
	}
}
