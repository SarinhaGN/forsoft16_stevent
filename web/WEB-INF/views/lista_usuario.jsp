<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
    <script src="resources/js/script.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
	<title>Usu�rios</title>
</head>
<body onload="setarVisibilidade();">
	<nav id="nave">
		<ul>
		  <li class="dropdown">
		    <a href="#" class="dropbtn">Listas</a>
		    <div class="dropdown-content">
		   		<a href="#">Atletas</a>
		     	<a href="#">Equipe</a>
	      	<a href="#">Evento</a>
	      	<a href="#">Local</a>
	      	<a href="#">Recurso</a>
		    </div>
		  </li>
		  <li><a href="#news">Perfil</a></li>
		  <li><a class="active" href="#home">Home</a></li>
		  <li id="logo-nav"> <img src="http://i.imgur.com/vqRrYH2.png"></img> </li>
		</ul>
	</nav>
	<form id="login-box" name="formulario" onsubmit="return validaInfo()">
		<div id="goibada" class="login-box-interno">
			<div id="login-box-label">
				<h1> Usu�rios </h1>
			</div>
			<div class="login-form">
				<div style="height: 80%; width: 100%; overflow: auto;">
					<table>
						<tr>
							<th>Nome</th>
							<th>Email</th>
							<th>Eventos</th>
							<th>Cargo</th>
						</tr>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</table>
				</div>
				<button type="button" class="btn_login" onclick="abrirModal();">Cadastrar Novos Usuarios</button>
			</div>
		</div>
	</form>
		<!-- Estrutura do modal -->
		<div id="modal" class="modal-cadastro">
					<a class="close" onclick="abrirModal();">X</a>
			<form id="login-box" name="formulario" onsubmit="return validaInfo()">
				<div id="modal-interno" class="login-box">
					<div id="login-box-label">
						<h1> Novo Usu�rio </h1>
					</div>
					<div class="login-form">
						<fieldset>
							<legend>Dados Pessoais:</legend>
							<div class="control-group">
								<div>
								<div class="form-divs">
									<label for="input-usuario">Nome:</label>
									<input name="nome" type="text" placeholder="Nome" class="login-field" id="input-usuario"/>
								</div>
								<div class="form-divs">
									<label for="input-usuario">Email:</label>
									<input name="email" type="text" placeholder="Email" class="login-field" id="input-usuario" />
								</div>
								</div>
								<div>
								<div class="form-divs">
									<label for="input-usuario">Senha:</label>
									<input name="senha" type="text" placeholder="senha" class="login-field" id="input-usuario"/>
								</div>
								<div class="form-divs">
									<label for="input-usuario">Confirmar senha:</label>
									<input name="confirmar senha" type="text" placeholder="confirmar senha" class="login-field" id="input-usuario" />
								</div>
								</div>
							</div>
						</fieldset>
						<fieldset>
							<legend>Outros Dados:</legend>
							<div class="control-group">
								<div>
									<label for="input-usuario">Eventos</label>
									<select>
										<option value="volvo">Futebol</option>
										<option value="saab">Atletismo</option>
										<option value="opel">Nata��o</option>
										<option value="audi">Volei</option>
									</select>
								</div>
								<div>
									<label for="input-usuario">Cargo</label>
									<select>
										<option value="volvo">Futebol</option>
										<option value="saab">Atletismo</option>
										<option value="opel">Nata��o</option>
										<option value="audi">Volei</option>
									</select>
								</div>
							</fieldset>
							<button type="submit" class="btn_login">Cadastrar</button>
						</div>
					</div>
				</div>
			</form>
		</div>
		<!-- Fim da estrutura do modal -->
</body>
</html>
