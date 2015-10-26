<div class="single">
	<!-- start span1_of_1 -->
	<div class="left_content">
		<div class="span_1_of_left">
			<div class="grid images_3_of_2">
				<ul id="etalage">
					<!-- 
					LOOP
					JAVA
					-->
					<li><img class="etalage_thumb_image" src="images/d1.jpg"
						class="img-responsive" /> <img class="etalage_source_image"
						src="images/d1.jpg" class="img-responsive" title="" /></li>
					<!-- 
					LOOP
					JAVA
					-->
				</ul>
				<div class="clearfix"></div>
			</div>

			<!-- start span1_of_1 -->
			<div class="span1_of_1_des">
				<div class="desc1">
					<h3>${produto.nome }</h3>
					<h5>${produto.preco }</h5>
					<div class="available">
						<h4>Available Options :</h4>
						<ul>
							<li>Color: <select>
									<!-- 
								LOOP
								JAVA
								 -->
									<option>Silver</option>
									<option>Black</option>
									<option>Dark Black</option>
									<option>Red</option>
									<!-- 
								LOOP
								JAVA
								 -->
							</select></li>
							<li>Size: <select>
									<!-- 
								LOOP
								JAVA
								 -->
									<option>L</option>
									<option>XL</option>
									<option>S</option>
									<option>M</option>
									<!-- 
								LOOP
								JAVA
								 -->
							</select>
							</li>
						</ul>
						<div class="btn_form">
							<form>
								<input type="submit" value="add to cart" title="" />
							</form>
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
					<!-- 
								LOOP
								JAVA
								 -->
					${produto.descricao }.
					<!-- 
								LOOP
								JAVA
								 -->
				</div>
				<div class="tab-content">
					<!-- 
								LOOP
								JAVA
								 -->
					Comentarios
					<!-- 
								LOOP
								JAVA
								 -->
				</div>
			</div>
		</div>

		<!-- end tabs -->
	</div>
	<div class="clearfix"></div>
</div>

