<div class="container">
	<div class="row">
		<div class="col-md-8">
			<h2 class="page-header">Enviadas</h2>
			<section class="comment-list">
				<!-- Esquerda Comment -->
				<article class="row">
				<c:if test="${empty mensagemList}">
				<div class="coats sing-c">
					<h3 class="c-head"> Voce nao possui mensagens!!</h3>
					</div>
				</c:if> 
					<c:forEach items="${mensagemList}" var="mensagem">
						<div class="col-md-2 col-sm-2 hidden-xs">
							<figure class="thumbnail">
								<img class="img-responsive"
									src="<%=request.getContextPath()%>/images/avatar.jpg" />
								<figcaption class="text-center">${usuarioWeb.nome}</figcaption>
							</figure>
						</div>

						<div class="col-md-10 col-sm-10">
							<div class="panel panel-default arrow left">
								<div class="panel-body">
									<header class="text-left">
										<div class="comment-user">
											<i class="fa fa-user"></i> Heitor
										</div>
										<time class="comment-date" datetime="${mensagem.data}">
											<i class="fa fa-clock-o"></i> ${mensagem.data}
										</time>
									</header>
									<div class="comment-post">
										<p>${mensagem.mensagem}</p>
									</div>

								</div>
							</div>
						</div>

					</c:forEach>
				</article>
			</section>
		</div>
	</div>
</div>