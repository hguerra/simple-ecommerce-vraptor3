<div class="single">
	<!-- start span1_of_1 -->
	<div class="left_content">
		<div class="span_1_of_left">
			<div class="grid images_3_of_2">
				<ul id="etalage">
					<li><img class="etalage_thumb_image"
						src="<%=request.getContextPath()%>/images/d1.jpg"
						class="img-responsive" /> <img class="etalage_source_image"
						src="<%=request.getContextPath()%>/images/d1.jpg"
						class="img-responsive" title="" /></li>
				</ul>
				<div class="clearfix"></div>
			</div>

			<!-- start span1_of_1 -->
			<div class="span1_of_1_des">
				<div class="desc1">
					<h3>${produto.nome }</h3>
					<h5>${produto.preco }</h5>
					<div class="available">
						<h4>Quantidade :</h4>
						<div class="btn_form">
							<form action="<c:url value="/carrinho"/>" method="POST">
								<input type="hidden" name="item.produto.id"
									value="${produto.id }" />
								<div class="col-lg-3 input-group input-group-sm">
									<span class="input-group-addon" id="sizing-addon1">Qtd</span> <input
										name="item.quantidade" value="1" type="number"
										class="form-control" aria-describedby="sizing-addon1">
								</div>
								<input type="submit" value="add to cart" title="" />
							</form>
							<c:if test="${usuarioWeb.logado }">
								<a href="<c:url value="/produtos/${produto.id}"/>"><button
										class="btn btn-warning"
										style="border-radius: 0%; font-size: 1.10em; padding: 8px 39px;">Editar</button></a>
								<br>
								<br>
								<a href="<c:url value="/mensagem/nova"/>"><button
										class="btn btn-success"
										style="border-radius: 0%; font-size: 1.10em; padding: 8px 24px;">
										Mensagem</button></a>
								<form action="<c:url value="/produtos/${produto.id}"/>"
									method="POST">
									<br>
									<button class="btn btn-danger"
										style="border-radius: 0%; font-size: 1.10em; padding: 8px 30px;"
										name="_method" value="DELETE">Remover</button>
								</form>
							</c:if>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
		<!-- start tabs -->
		<!--Horizontal Tab-->
		<div id="horizontalTab">
			<ul class="resp-tabs-list">
				<li>Descrição</li>
				<li>Comentários</li>
			</ul>
			<div class="resp-tabs-container">
				<div class="tab-content">
					<font size="5">${produto.descricao }.</font>
				</div>
				<div class="tab-content">
					<c:forEach items="${produto.comentarios }" var="comentario">
						<font size="3">Nome: ${comentario.nome}</font><br>
						<font size="3">Nota: ${comentario.nota}</font><br>
						<font size="3">Comentario: ${comentario.comentario}</font><br>
						<hr>
					</c:forEach>
				</div>
			</div>
		</div>
		<!-- Comentario -->
		<c:if test="${usuarioWeb.logado }">
			<div class="container">
				<div class="row" style="margin-top: 40px;">
					<div class="col-md-6">
						<div class="well well-sm">
							<div class="text-right">
								<a class="btn btn-success btn-green" href="#reviews-anchor"
									id="open-review-box">Comentar</a>
							</div>

							<div class="row" id="post-review-box" style="display: none;">
								<div class="col-md-12">
									<form accept-charset="UTF-8"
										action="<c:url value="/produtos/${produto.id}/comentario"/>"
										method="post">
										<input type="hidden" name="comentario.id"
											value="${comentario.id }" /> <input type="hidden"
											name="comentario.nome" value="${usuarioWeb.nome }" /> <input
											id="ratings-hidden" name="comentario.nota"
											value="${comentario.nota}" type="hidden">
										<textarea class="form-control animated" cols="50"
											id="new-review" placeholder="Digite seu comentario..."
											rows="5" name="comentario.comentario">${comentario.comentario}</textarea>

										<div class="text-right">
											<div class="stars starrr" data-rating="0"></div>
											<a class="btn btn-danger btn-sm" href="#"
												id="close-review-box"
												style="display: none; margin-right: 10px;"> <span
												class="glyphicon glyphicon-remove"></span>Cancel
											</a>
											<button class="btn btn-success btn-lg" type="submit">Save</button>
										</div>
									</form>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</c:if>
		<!-- Comentario -->
	</div>
	<div class="clearfix"></div>
</div>