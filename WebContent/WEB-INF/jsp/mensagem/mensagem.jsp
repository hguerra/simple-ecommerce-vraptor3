<div class="container">
	<div class="main">
		<div class="contact">
			<div class="contact_info">
				<h2>Nova Mensagem</h2>
			</div>
			<div class="contact-form">
				<h2>Enviar</h2>
				<form id="mensagemForm" action="<c:url value="/mensagem/envia"/>"
					method="POST">
					<div>
						<input type="hidden" class="textbox" id="data"
							name="mensagem.data" value="${mensagem.data }">
					</div>
					<div>
						<span><label>Mensagem</label></span>
						<textarea placeholder="Descricao" id="mensagem"
							name="mensagem.mensagem">
								${mensagem.mensagem }
									</textarea>
					</div>

					<div>
						<input type="hidden" class="textbox" id="destinatarioId"
							name="mensagem.destinatarioId" value="${mensagem.destinatarioId}">


					</div>
					<div>
						<input type="hidden" class="textbox" id="usuarioId"
							name="mensagem.usuarioId" value="${usuarioWeb.usuario.login }">
					</div>

					<div>
						<span><input type="submit"></span>
					</div>
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>