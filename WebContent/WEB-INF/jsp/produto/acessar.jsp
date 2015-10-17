<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<div style="background-color: red; color: white">
<c:forEach var="error" items="${errors}">
    ${error.category} - ${error.message}<br />
</c:forEach>

</div>

<form action='http://localhost:8080/ecommerce/produto/salvar'>

	<input type="text" name="produto.nome" placeholder="Nome">
	
	<input type="number" name="produto.preco" placeholder="Preço">
	
	<input type="submit" value="Salvar">

</form>


</body>
</html>