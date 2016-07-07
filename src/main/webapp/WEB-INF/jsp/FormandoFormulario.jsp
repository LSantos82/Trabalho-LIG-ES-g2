<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="Author" content="TurtleLearning.com">
<title>Formulário de Formando</title>
</head>
<body>
	<form:form method="POST" modelAttribute="formandoBean">
		<form:label path="nome">Nome</form:label>
		<form:input path="nome" label="Nome" />
		<br />
		<br />
		<form:label path="anoInscricao">Ano de inscrição (yyyy)</form:label>
		<form:input path="anoInscricao" label="Ano de inscrição" />
		<br />
		<br />
		<form:label path="dataNascimento">Data de nascimento (yyyy-MM-dd)</form:label>
		<form:input path="dataNascimento"
			label="Data de nascimento (yyyy-MM-dd)" />
		<br />
		<br>
		<form:checkbox path="generoMasculino" label="Genero Masculino?" />
		<br />
		<br />
		
		<input type="button" value="Menu" name="Menu"
			onclick="openPage('Menu')" />

		<script type="text/javascript">
			function openPage(pageURL) {
				window.location.href = pageURL;
			}
		</script>
		<input type="submit" value="Gravar" name="Gravar" />
	</form:form>
</body>
</html>