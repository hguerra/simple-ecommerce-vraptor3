<div class="container">
	<div class="My-wish-section">
		<section id="wish">
			<div class="my-wish-content">
				<div class="pag-nav">
					<ul class="p-list">
						<li><a href="<%=request.getContextPath()%>/index.jsp">Home</a></li>
						&nbsp;&nbsp;/&nbsp;
						<li class="act">&nbsp;Carrinho(${carrinho.totalDeItens })</li>
					</ul>
				</div>
				<div class="coats sing-c">
					<h3 class="c-head">Seu Carrinho(${carrinho.totalDeItens })</h3>

					<c:if test="${carrinho.totalDeItens < 0 }">
						<p>
							Seu carrinho esta vazio, por favor click <a
								href="<c:url value="/produtos"/>">aqui</a> e realize suas
							compras!
						</p>
					</c:if>

					<c:if test="${carrinho.totalDeItens > 0 }">
						<h3 class="c-head">
							Total:
							<fmt:formatNumber type="currency" value="${carrinho.total }" />
						</h3>

						<div class="clearfix"></div>
						<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
							<div class="cbp-vm-options">
								<a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected"
									data-view="cbp-vm-view-grid" title="grid">Grade</a> <a href="#"
									class="cbp-vm-icon cbp-vm-list" data-view="cbp-vm-view-list"
									title="list">Lista</a>
							</div>
							<div class="clearfix"></div>

							<ul>
								<c:forEach items="${carrinho.itens}" var="item" varStatus="s">
									<li>
										<div class="view view-first">
											<div class="inner_content clearfix">
												<div class="product_image">
													<img src="<%=request.getContextPath()%>/images/bb2.jpg"
														class="img-responsive" alt="" />
													<div class="product_container">
														<div class="cart-left">
															<p class="title">${item.produto.nome }</p>
														</div>
														<div class="pricey">
															<fmt:formatNumber type="currency"
																value="${item.produto.preco }" />
														</div>
														<div class="clearfix"></div>
													</div>
												</div>
											</div>
										</div>
										<div class="cbp-vm-details">${item.produto.descricao }.</div>
										<div>
											<form action="<c:url value="/carrinho/${s.index}"/>"
												method="POST">
												<button class="cbp-vm-icon cbp-vm-add" name="_method"
													value="DELETE">Remover</button>
											</form>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
						<script
							src="<%=request.getContextPath()%>/javascripts/cbpViewModeSwitch.js"
							type="text/javascript"></script>
						<script src="<%=request.getContextPath()%>/javascripts/classie.js"
							type="text/javascript"></script>

						<c:if test="${usuarioWeb.logado}">

							<div class="btn_form">
								<form action="<c:url value="/carrinho/finalizar"/>"
									method="POST">
									<input type="submit" value="Concluir Compra" />
								</form>
							</div>
						</c:if>

					</c:if>
				</div>
			</div>
		</section>
	</div>
</div>