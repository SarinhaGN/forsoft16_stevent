<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css">
    <script src="../resources/js/script.js"></script>
    <!-- <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"> -->
	<title>Cadastro Equipe</title>
</head>
<body>
  <nav id="nave">
  <div id="logo-nav"> LOGO </div>
  <div id="texto-nav"><h1>Lunaris</h1></div>
  </nav>
	<form id="login-box" name="formulario" onsubmit="return validaInfo()">
		<div id="goibada" class="login-box-interno">
			<div id="login-box-label">
				<h1> Novo Evento </h1>
			</div>
			<div class="login-form">
				<fieldset>
  				<legend>Dados do Evento:</legend>
					<div class="control-group">
						<div>
							<label for="input-usuario">Nome:</label>
							<input name="nome" type="text" class="login-field" id="input-usuario"/>
							<label for="input-usuario">Descrição:</label>
							<input name="descrição" type="text" class="login-field" id="input-usuario" />
						</div>
					</div>
				</fieldset>
				<fieldset>
					<legend>Outras informações:</legend>
					<div class="control-group">
						<div>
							<label for="input-usuario">Local:</label>
							<input name="local" type="text" class="login-field" id="input-usuario" />
						</div>
          				<div>
							<label for="input-usuario">Equipe</label>
							<select>
								<option value="volvo">Equipe</option>
							</select>
						</div>
					</fieldset>
          <button type="submit" class="btn_login">Cadastrar</button>
      	</div>
		</div>
	</form>
</body>
</html>