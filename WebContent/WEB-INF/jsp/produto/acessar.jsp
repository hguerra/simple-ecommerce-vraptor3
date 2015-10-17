<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<div style="background-color: red; color: white">
<c:forEach var="error" items="${errors}">
    ${error.category} - ${error.message}<br />
</c:forEach>

</div>

<form action='salvar'>

	<input type="text" name="produto.nome" placeholder="Nome">
	
	<input type="number" name="produto.preco" placeholder="Preço">
	
	<input type="submit" value="Salvar">

</form>

<br>


<form action='pesquisar'>

	<input type="text" name="pesquisa" placeholder="Pesquisa">
	
	<input type="submit" value="Pesquisar">

</form>

<br>

<c:forEach var="produto" items="${produtos}">
    ${produto.nome} - ${produto.preco} <br>
</c:forEach>


</body>
</html>