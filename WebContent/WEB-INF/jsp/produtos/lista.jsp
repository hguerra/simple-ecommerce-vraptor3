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
			<div class="mens-toolbar">
				<div class="sort">
					<div class="sort-by">
						<label>Sort By</label> <select>
							<option value="">Position</option>
							<option value="">Name</option>
							<option value="">Price</option>
						</select> <a href=""><img src="images/arrow2.gif" alt=""
							class="v-middle"></a>
					</div>
				</div>
				<ul class="women_pagenation dc_paginationA dc_paginationA06">
					<li><a href="#" class="previous">Page:</a></li>
					<!-- 
					LOOP
					JAVA
					-->
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<!-- 
					/LOOP
					JAVA
					-->
				</ul>
				<div class="clearfix"></div>
			</div>
			<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
				<div class="cbp-vm-options">
					<a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected"
						data-view="cbp-vm-view-grid" title="grid">Grid View</a> <a
						href="#" class="cbp-vm-icon cbp-vm-list"
						data-view="cbp-vm-view-list" title="list">List View</a>
				</div>
				<div class="pages">
					<div class="limiter visible-desktop">
						<label>Show</label> <select>
							<option value="" selected="selected">9</option>
							<option value="">15</option>
							<option value="">30</option>
						</select> per page
					</div>
				</div>
				<div class="clearfix"></div>
				<ul>
					<!-- 
					LOOP
					JAVA
					-->
					<c:forEach items="${produtoList}" var="produto">

						<li>
							<div class="view view-first">
								<div class="inner_content clearfix">
									<div class="product_image">
										<img src="images/bb2.jpg" class="img-responsive" alt="" />
										<div class="mask">
											<div class="info">
												<a class="cbp-vm-image info" href="<c:url value="/produtos/${produto.id}/single"/>">
													Quick View </a>
												<!--class="cbp-vm-image info"   >Quick View-->
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
										value="${produto.id }" /> <input class="qtde"
										name="item.quantidade" value="1" />
									<button class="cbp-vm-icon cbp-vm-add" type="submit">Comprar</button>
								</form>
							</div>
							<div>
								<c:if test="${usuarioWeb.logado }">
									<a href="<c:url value="/produtos/${produto.id}"/>"> Editar
									</a>
									<form action="<c:url value="/produtos/${produto.id}"/>"
										method="POST">
										<button class="link" name="_method" value="DELETE">
											Remover</button>
									</form>
								</c:if>
							</div>
						</li>
					</c:forEach>

					<li>
						<div class="view view-first">
							<div class="inner_content clearfix">
								<div class="product_image">
									<img src="images/bb2.jpg" class="img-responsive" alt="" />
									<div class="mask">
										<div class="info">
											<a class="cbp-vm-image info" href="single.jsp">Quick View</a>
										</div>
									</div>
									<div class="product_container">
										<div class="cart-left">
											<p class="title">Lorem Ipsum 2014</p>
										</div>
										<div class="pricey">$99.00</div>
										<div class="clearfix"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="cbp-vm-details">Silver beet shallot wakame
							tomatillo salsify mung bean beetroot groundnut.</div> <a
						class="cbp-vm-icon cbp-vm-add" href="#">Add to cart</a>
					</li>
					<!-- 
					/LOOP
					JAVA
					-->
				</ul>
			</div>
			<script src="javascripts/cbpViewModeSwitch.js" type="text/javascript"></script>
			<script src="javascripts/classie.js" type="text/javascript"></script>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="clearfix"></div>
</div>

