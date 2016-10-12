<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css">
    <script src="../resources/js/script.js"></script>
    <!-- <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"> -->
	<title>Locais</title>
</head>
<body>
    <nav id="nave">
      <div id="logo-nav"> LOGO </div>
      <div id="texto-nav"><h1>Lunaris</h1></div>
    </nav>
    <form id="login-box" name="formulario" onsubmit="return validaInfo()">
		<div id="goibada" class="login-box-interno">
			<div id="login-box-label">
				<h1> Equipes </h1>
			</div>
  			<div class="login-form">
  				<table>
            <tr>
                <th>Nome</th>
                <th>Descrição</th>
                <th>Local</th>
                <th>Equipe</th>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
          </table>
          <button type="submit" class="btn_login">Cadastrar Novo Evento</button>
        </div>
		  </div>
	 </form>
</body>
</html>