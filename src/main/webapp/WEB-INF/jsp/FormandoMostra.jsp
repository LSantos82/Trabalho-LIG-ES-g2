<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Proprietário Mostra</title>
</head>
<body>
	<h2>Dados de formando:</h2>
	<p>${myMensagem1}</p>
	<p>${myMensagem2}</p>
	<p>${myMensagem3}</p>
	<p>${myMensagem4}</p>

	<input type="button" value="Menu" name="Menu"
		onclick="openPage('Menu')" />

	<script type="text/javascript">
		function openPage(pageURL) {
			window.location.href = pageURL;
		}
	</script>
</body>
</html>