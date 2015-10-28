<div class="container">
	<div class="registration">
		<div class="registration_left">
			<h2>Novo Produto</h2>
			<div class="clear"></div>
			<div class="registration_form">
				<!-- Form -->
				<form id="produtosForm" action="<c:url value="/produtos"/>"
					method="POST">
					<div>
						<label> <input placeholder="Nome" id="nome"
							class="required" minlength="3" type="text" name="produto.nome"
							value="${produto.nome }">
						</label>
					</div>
					<div class="form-group">
						<label> <textarea class="form-control" style="resize:none" placeholder="Descricao.." id="descricao"
								class="required" maxlength="40" name="produto.descricao">
								${produto.descricao }
									</textarea>
						</label>
					</div>
					<div>
						<label> <input placeholder="Preco" id="preco" min="0"
							type="text" name="produto.preco" value="${produto.preco }">
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
		$('#produtosForm').validate();
	</script>
</div>