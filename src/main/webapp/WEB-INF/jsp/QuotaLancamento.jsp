<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Lançamento de Quota</title>
</head>
<body>
	<form:form method="POST" modelAttribute="quotaBean">
		<form:label path="numero_recibo">Número de Recibo</form:label>
		<form:input path="numero_recibo" label="Número de Recibo" />
		<br />
		<br />
		<form:label path="estado">Estado</form:label>
		<form:input path="estado" label="Estado" />
		<br />
		<br />
		<form:label path="valor">Valor</form:label>
		<form:input path="valor" label="Valor" />
		<br />
		<br />
		<form:label path="data_inicio">Data de inicio de pagamento (yyyy-MM-dd)</form:label>
		<form:input path="data_inicio"
			label="Data de inicio de pagamento (yyyy-MM-dd)" />
		<br />
		<br />
		<form:label path="data_fim">Data de fim de pagamento (yyyy-MM-dd)</form:label>
		<form:input path="data_fim"
			label="Data de fim de pagamento (yyyy-MM-dd)" />
		<br />
		<br />
		<form:label path="modo_pagamento">Modo pagamento</form:label>
		<form:input path="modo_pagamento" label="Modo pagamento" />
		<br />
		<br />
		<form:label path="descricao_pagamento">Descricao do pagamento</form:label>
		<form:input path="descricao_pagamento" label="Descricao do pagamento" />
		<br />
		<br />
		<form:label path="quem_registou">Registo efetuado por</form:label>
		<form:input path="quem_registou" label="Registo efetuado por" />
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