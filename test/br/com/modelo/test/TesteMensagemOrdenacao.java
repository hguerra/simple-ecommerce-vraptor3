package br.com.modelo.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.modelo.Mensagem;

public class TesteMensagemOrdenacao {

	public static void main(String[] args) {
		
		Set<Mensagem> mensagens = new HashSet<Mensagem>();
		
		mensagens.add(new Mensagem("segunda add", "teste", "teste"));
		mensagens.add(new Mensagem("primeira add", "teste", "teste"));
		mensagens.add(new Mensagem("terceira add", "teste", "teste"));
		
		List<Mensagem> lista = new ArrayList<Mensagem>(mensagens);
		
		Collections.sort(lista);

		for(Mensagem m: lista){
			System.out.println(m.getMensagem());
		}

	}

}
