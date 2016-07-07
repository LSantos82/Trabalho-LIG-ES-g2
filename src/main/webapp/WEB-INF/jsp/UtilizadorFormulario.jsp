<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Formulário do Utilizador</title>
</head>
<body>
	<form:form method="POST" modelAttribute="utilizadorBean">
		<h2>Formulário do Utilizador:</h2>
		<form:label path="pwd">Password</form:label>
		<form:input path="pwd" label="Password" />
		<br />
		<br />
		<form:label path="nome">Nome</form:label>
		<form:input path="nome" label="Nome" />
		<br />
		<br />
		<form:label path="perfil">Perfil</form:label>
		<form:input path="perfil" label="Perfil" />
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