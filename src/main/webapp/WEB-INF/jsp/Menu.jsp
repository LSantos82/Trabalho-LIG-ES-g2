<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Menu Gestão de Condominios</title>
</head>
<body>
	<form name="GCondominiosMenu" action="GCondominiosMenu" method="get">

		<h1>Menu Gestão de Condominios</h1>
		<input type="button" value="Formulário do Condominio" name="Formulário do Condominio"
			onclick="openPage('CondominioFormulario')" /> 
			<br />
			<br />
		<input type="button" value="Formulário do Proprietário" name="Formulário do Proprietário"
			onclick="openPage('ProprietarioFormulario')" />
			<br />
			<br />
		<input type="button" value="Formulário da Fração" name="Formulário da Fração"
			onclick="openPage('FracaoFormulario')" />
			<br />
			<br />
		<input type="button" value="Formulário do Utilizador" name="Formulário do Utilizador"
			onclick="openPage('UtilizadorFormulario')" />
			<br />
			<br />
		<input type="button" value="Lançamento de Quota" name="Lançamento de Quota"
			onclick="openPage('QuotaLancamento')" />

	</form>
	<script type="text/javascript">
		function openPage(pageURL) {
			window.location.href = pageURL;
		}
	</script>
</body>
</html>