
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
  <script src="resources/js/script.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
	<title>Equipes</title>
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
				<h1> Equipes </h1>
			</div>
			<div class="login-form">
				<div style="height: 80%; width: 100%; overflow: auto;">
					<table>
		        <tr>
	            <th>Nome</th>
	            <th>Modalidade</th>
	            <th>Atleta</th>
		        </tr>
		        <tr>
	            <td></td>
	            <td></td>
	            <td></td>
		        </tr>
		      </table>
				</div>
	      <button type="button" class="btn_login" onclick="abrirModal();">Cadastrar Novas Equipes</button>
	    </div>
	  </div>
	</form>
	<!-- Estrutura do modal -->
	<div id="modal" class="modal-cadastro">
				<a class="close" onclick="abrirModal();">X</a>
		<form id="login-box" name="formulario" onsubmit="return validaInfo()">
			<div id="goibada" class="login-box-interno">
				<div id="login-box-label">
					<h1> Nova Equipe </h1>
				</div>
				<div class="login-form">
					<fieldset>
	  				<legend>Dados da Equipe:</legend>
						<div class="control-group">
							<div>
								<label for="input-usuario">Nome da Equipe:</label>
								<input name="nome" type="text" class="login-field" id="input-usuario"/>
	            </div>
						</div>
					</fieldset>
					<fieldset>
						<legend>Equipe:</legend>
						<div class="control-group">
							<div>
								<label for="input-usuario">Modalidade</label>
								<select>
									<option value="volvo">Usuário</option>
									<option value="saab">Usuário</option>
									<option value="opel">Usuário</option>
									<option value="audi">Usuário</option>
								</select>
							</div>
	            <div>
								<label for="input-usuario">Atletas</label>
								<select>
									<option value="volvo">Usuário</option>
									<option value="saab">Usuário</option>
									<option value="opel">Usuário</option>
									<option value="audi">Usuário</option>
								</select>
							</div>
						</div>
					</fieldset>
	        <button type="submit" class="btn_login">Cadastrar</button>
				</div>
	    </div>
		</form>
	</div>
	<!-- Fim da estrutura do modal -->
</body>
</html>
