<div class="container">
	<div class="registration">
		<div class="registration_left">
			<h2>Usuario existente</h2>
			<div class="clear"></div>
			<div class="registration_form">
				<!-- Form -->
				<form action="<c:url value="/login"/>" method="POST">
					<div>
						<label> <input placeholder="usuario" id="login"
							type="text" name="usuario.login" tabindex="3" required>
						</label>
					</div>
					<div>
						<label> <input placeholder="password" id="senha" 
						type="password" name="usuario.senha"
							tabindex="4" required>
						</label>
					</div>
					<div>
						<input type="submit" value="Login" id="register-submit">
					</div>
				</form>
				<!-- /Form -->
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>