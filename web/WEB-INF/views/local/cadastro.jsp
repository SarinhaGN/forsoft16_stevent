<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css">
    <script src="../resources/js/script.js"></script>
    <!-- <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"> --> 
	<title>Cadastro</title>
</head>
<body>
    <nav id="nave">
    <div id="logo-nav"> LOGO </div>
    <div id="texto-nav"><h1>Lunaris</h1></div> 
    </nav>
	<form id="login-box" name="formulario" onsubmit="return validaInfo()">
		<div id="goibada" class="login-box-interno">

			<div id="login-box-label">
				<h1> Endereço </h1>
			</div> 

			<div class="login-form">
				<fieldset>
    				<legend>Dados do endereço:</legend>
					<div class="control-group"> 
						<div>
							<label for="input-usuario">Cidade:</label> 
							<input name="Cidade" type="text" placeholder="Cidade" class="login-field" id="input-usuario"/>
							<label for="input-usuario">Bairro:</label>
							<input name="Bairro" type="text" placeholder="Cidade" class="login-field" id="input-usuario" />
						</div>
						<div>
							<label for="input-usuario">Estado:</label>
							<input name="Estado" type="text" placeholder="Estado" class="login-field" id="input-usuario"/>
							<label for="input-usuario">CEP:</label>
							<input name="CEP" type="text" placeholder="CEP" class="login-field" id="input-usuario" />
							
						</div>
                        <div>
							<label for="input-usuario">Rua:</label>
							<input name="Rua" type="text" placeholder="Rua" class="login-field" id="input-usuario"/>
							<label for="input-usuario">Numero:</label>
							<input name="Numero" type="text" placeholder="Numero" class="login-field" id="input-usuario" />
				            <label for="input-usuario">Complemento:</label>
							<input name="Complemento" type="text" placeholder="Complemento" class="login-field" id="input-usuario" />
						</div>
					</div>
				</fieldset>
				<button type="submit" class="btn_login">Cadastrar</button>

            </div>
		</div>
	</form>
</body>
</html>