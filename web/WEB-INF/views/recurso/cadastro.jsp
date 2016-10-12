<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css">
    <script src="../resources/js/script.js"></script>
    <!-- <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"> --> 
	<title>Cadastro Recursos</title>
</head>
<body>
    <nav id="nave">
    <div id="logo-nav"> LOGO </div>
    <div id="texto-nav"><h1>Lunaris</h1></div> 
    </nav>
	<form id="login-box" name="formulario" onsubmit="return validaInfo()">
		<div id="goibada" class="login-box-interno">

			<div id="login-box-label">
				<h1> Recursos </h1>
			</div> 

			<div class="login-form">
				<fieldset>
    				<legend>Dados do endereço:</legend>
					<div class="control-group"> 
						<div>
							<label for="input-usuario">nome:</label> 
							<input name="Nome" type="text" placeholder="Nome" class="login-field" id="input-usuario"/>
							<label for="input-usuario">Disponibildade:</label>
							<input name="Disponibilidade" type="text" placeholder="Disponibilidade" class="login-field" id="input-usuario" />
						</div>
						<div>
							<label for="input-usuario">Local:</label>
							<input name="Local" type="text" placeholder="Local" class="login-field" id="input-usuario"/>
                        </div>
                    </div>
				</fieldset>
				<button type="submit" class="btn_login">Cadastrar</button>

            </div>
		</div>
	</form>
</body>
</html>