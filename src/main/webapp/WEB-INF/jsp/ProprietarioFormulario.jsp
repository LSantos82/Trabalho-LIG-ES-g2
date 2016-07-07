<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Formulário do Proprietário</title>
</head>
<body>
	<form:form method="POST" modelAttribute="proprietarioBean">
		<h2>Formulário do Proprietário:</h2>
		<form:label path="nome">Nome</form:label>
		<form:input path="nome" label="Nome" />
		<br />
		<br />
		<form:label path="tipo">Tipo (Individual, Coletiva)</form:label>
		<form:input path="tipo" label="Tipo" />
		<br />
		<br />
		<form:label path="nif">NIF</form:label>
		<form:input path="nif" label="NIF" />
		<br />
		<br />
		<form:label path="morada">Morada</form:label>
		<form:input path="morada" label="Morada" />
		<br />
		<br />
		<form:label path="cod_postal1">Cod.Postal</form:label>
		<form:input path="cod_postal1" label="Cod.Postal" />
		<form:label path="cod_postal2">-</form:label>
		<form:input path="cod_postal2" label="Cod.Postal2" />
		<br />
		<br />
		<form:label path="telemovel">Telemovel</form:label>
		<form:input path="telemovel" label="telemovel" />
		<br />
		<br />
		<form:label path="telefone">Telefone</form:label>
		<form:input path="telefone" label="Telefone" />
		<br />
		<br />
		<form:label path="notas">Notas</form:label>
		<form:input path="notas" label="Notas" />
		<br />
		<br />
		<input type="submit" value="Gravar" name="Gravar" />

		<input type="button" value="Menu" name="Menu"
			onclick="openPage('Menu')" />

		<script type="text/javascript">
			function openPage(pageURL) {
				window.location.href = pageURL;
			}
		</script>
	</form:form>
</body>
</html>