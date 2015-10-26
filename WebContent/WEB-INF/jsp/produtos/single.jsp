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
								<a href="<c:url value="/produtos/${produto.id}"/>"><button class="btn btn-warning" style="border-radius: 0%; font-size: 1.10em; padding: 8px 39px;">Editar</button></a>
								<form action="<c:url value="/produtos/${produto.id}"/>"
									method="POST">
									<br><button class="btn btn-danger"  style="border-radius: 0%; font-size: 1.10em; padding: 8px 30px;"  name="_method" value="DELETE">
										Remover</button>
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
					<!-- 
								LOOP
								JAVA
								 -->
					<font size="5">Comentarios</font>
					<!-- 
								LOOP
								JAVA
								 -->
				</div>
			</div>
		</div>
	</div>
	<div class="clearfix"></div>
</div>