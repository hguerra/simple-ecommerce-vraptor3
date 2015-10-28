package br.com.controle;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.dao.MensagemDao;
import br.com.interceptor.Restrito;
import br.com.modelo.Mensagem;

@Resource
public class MensagemController {
	private final MensagemDao dao;
	private final Result result;
	private final Validator validator;

	public MensagemController(MensagemDao dao, Result result,
			Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}

	@Restrito
	@Get("/mensagem/nova")
	public void mensagem() {

	}

	@Restrito
	@Post("/mensagem/envia")
	public void envia(Mensagem mensagem) {
		if (mensagem == null || mensagem.getMensagem().isEmpty()) {
			validator.add(new ValidationMessage("Mensagem nao pode ser vazia",
					"mensagem.mensagem"));
		}
		validator.onErrorRedirectTo(MensagemController.class).mensagem();
		dao.enviarMensagem(mensagem);
		result.redirectTo(this).visualizaEnviadas();
	}

	@Restrito
	@Get("/mensagem/enviadas")
	public List<Mensagem> visualizaEnviadas() {
		return dao.listarTodasEnviadas();
	}

	@Restrito
	@Get("/mensagem/recebidas")
	public List<Mensagem> visualizaRecebidas() {
		return dao.listarTodasRecebidas();
	}
}
