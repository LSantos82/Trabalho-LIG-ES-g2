<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Formulário de Formando</title>
</head>
<body>
	<form:form method="POST" modelAttribute="fracaoBean">
		<h2>Formulário de Fração:</h2>
		<form:label path="descricao">Descricao</form:label>
		<form:input path="descricao" label="Descricao" />
		<br />
		<br />
		<form:label path="area">Área</form:label>
		<form:input path="area" label="Área" />
		<br />
		<br />
		<form:label path="percentagem_area_total">Percentagem Área Total</form:label>
		<form:input path="percentagem_area_total" label="Percentagem Área Total" />
		<br />
		<br />
		<form:label path="tipo_fracao">Tipo Fração</form:label>
		<form:input path="tipo_fracao" label="Tipo Fração" />
		<br />
		<br />
		<form:label path="periodicidade_pag_quota">Periodicidade Pag. Quota</form:label>
		<form:input path="periodicidade_pag_quota" label="Periodicidade Pag. Quota" />
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