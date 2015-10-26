<div class="container">
	<div class="registration">
		<div class="registration_left">
			<h2>Novo usuario?</h2>
			<div class="clear"></div>
			<div class="registration_form">
				<!-- Form -->
				<form id="usuariosForm" action="<c:url value="/usuarios"/>"
					method="POST">
					<div>
						<label> <input placeholder="nome" id="nome"
							class="required" type="text" name="usuario.nome"
							value="${usuario.nome }" tabindex="1" required autofocus>
						</label>
					</div>
					<div>
						<label> <input placeholder="login" id="login"
							class="required" type="text" name="usuario.login"
							value="${usuario.login }" tabindex="2" required autofocus>
						</label>
					</div>
					<div>
						<label> <input placeholder="senha" id="senha"
							class="required" type="password" name="usuario.senha"
							tabindex="4" required>
						</label>
					</div>
					<div>
						<label> <input placeholder="confirmacao senha"
							id="confirmacao" equalTo="#senha" type="password" tabindex="4"
							required>
						</label>
					</div>
					<div>
						<input type="submit">
					</div>

				</form>
				<!-- /Form -->
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	<script type="text/javascript">
		$('#usuariosForm').validate();
	</script>
</div>