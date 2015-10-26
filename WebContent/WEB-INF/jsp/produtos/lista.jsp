<div class="container">
	<div class="products-page">
		<div class="product">
			<div class="product-listy">
				<h3>Categorias</h3>
				<!-- 
				LOOP
				JAVA
				-->
				<ul class="product-list">
					<li><a href="">T-shirts</a></li>
					<li><a href="">pants</a></li>
				</ul>
				<!-- 
				/LOOP
				JAVA
				-->
			</div>
		</div>
		<div class="new-product">
			<div class="new-product-top">
				<ul class="product-top-list">
					<li><a href="index.jsp">Home</a>&nbsp;<span>&gt;</span></li>
					<li><span class="act">Best Sales</span>&nbsp;</li>
				</ul>
				<p class="back">
					<a href="index.jsp">Back to Previous</a>
				</p>
				<div class="clearfix"></div>
			</div>
			<div class="clearfix"></div>
			<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
				<div class="cbp-vm-options">
					<a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected"
						data-view="cbp-vm-view-grid" title="grid">Grade</a> <a
						href="#" class="cbp-vm-icon cbp-vm-list"
						data-view="cbp-vm-view-list" title="list">Lista</a>
				</div>
				<div class="clearfix"></div>
				<ul>
					<c:forEach items="${produtoList}" var="produto">

						<li>
							<div class="view view-first">
								<div class="inner_content clearfix">
									<div class="product_image">
										<img src="<%=request.getContextPath()%>/images/bb2.jpg" class="img-responsive" alt="" />
										<div class="mask">
											<div class="info">
												<a class="cbp-vm-image info" href="<c:url value="/produtos/${produto.id}/single"/>">
													Quick View </a>
											</div>
										</div>
										<div class="product_container">
											<div class="cart-left">
												<p class="title">${produto.nome }</p>
											</div>
											<div class="pricey">${produto.preco }</div>
											<div class="clearfix"></div>
										</div>
									</div>
								</div>
							</div>
							<div class="cbp-vm-details">${produto.descricao }.</div>
							<div>
								<!-- Adicionando o produto no carrinho de compras -->
								<form action="<c:url value="/carrinho"/>" method="POST">
									<input type="hidden" name="item.produto.id"
										value="${produto.id }" /> <input type="hidden" class="qtde"
										name="item.quantidade" value="1" />
									<button class="cbp-vm-icon cbp-vm-add" type="submit">Comprar</button>
								</form>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
			<script src="<%=request.getContextPath()%>/javascripts/cbpViewModeSwitch.js" type="text/javascript"></script>
			<script src="<%=request.getContextPath()%>/javascripts/classie.js" type="text/javascript"></script>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="clearfix"></div>
</div>