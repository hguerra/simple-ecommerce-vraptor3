package br.com.controle;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.dao.ProdutoDao;
import br.com.modelo.Produto;

@Resource
public class ProdutosController {
	private final ProdutoDao dao;
	private final Result result;
	private final Validator validator;

	public ProdutosController(ProdutoDao dao, Result result, Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}

	public List<Produto> lista() {
		return dao.listaTudo();
	}

	public void adiciona(Produto produto) {
		if (produto.getNome() == null || produto.getNome().length() < 3) {
			validator.add(
					new ValidationMessage("Nome é obrigatório e precisa ter mais" + " de 3 letras", "produto.nome"));
		}
		if (produto.getDescricao() == null || produto.getDescricao().length() > 40) {
			validator.add(new ValidationMessage("Descrição é obrigatória não pode ter mais" + " que 40 letras",
					"produto.descricao"));
		}
		if (produto.getPreco() == null || produto.getPreco() <= 0) {
			validator.add(new ValidationMessage("Preço precisa ser positivo", "produto.preco"));
		}
		validator.onErrorUsePageOf(ProdutosController.class).formulario();
		dao.salva(produto);
		result.redirectTo(this).lista();
	}

	public void formulario() {
	}

	public Produto edita(Long id) {
		return dao.carrega(id);
	}

	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}

	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
