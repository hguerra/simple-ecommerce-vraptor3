package br.com.malandro.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.malandro.modelo.Produto;

@Resource
public class ProdutoController {

	private Result result;
	private Validator validator;

	public ProdutoController(Result result, Validator validator) {

		this.result = result;
		this.validator = validator;
	}

	public void acessar() {

		result.include("x", 1000);
	}

	public void salvar(Produto produto) {

		if (produto.getNome() == null) {

			validator.add(new ValidationMessage("O nome do produto deve estar preenchido", "Erro"));
			validator.onErrorRedirectTo(this).acessar();
		}

		System.out.println(produto.getNome());
		System.out.println(produto.getPreco());
		System.out.println();
	}
}
