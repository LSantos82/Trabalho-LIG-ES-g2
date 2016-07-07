<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="Author" content="pt.ulusofona.es.g3">
<title>Condominio Mostra</title>
</head>
<body>
	<h2>Dados do condominio:</h2>
	<p>${myMensagem1}</p>
	<p>${myMensagem2}</p>
	<p>${myMensagem3}</p>
	<p>${myMensagem4}</p>
	<p>${myMensagem5}</p>
	<p>${myMensagem6}</p>

	<input type="button" value="Menu" name="Menu"
		onclick="openPage('Menu')" />

	<script type="text/javascript">
		function openPage(pageURL) {
			window.location.href = pageURL;
		}
	</script>
</body>
</html>