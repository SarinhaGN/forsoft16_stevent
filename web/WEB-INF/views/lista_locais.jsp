<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
  <script src="resources/js/script.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
	<title>Locais</title>
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
				<h1> Locais </h1>
			</div>
			<div class="login-form">
				<div style="height: 80%; width: 100%; overflow: auto;">
					<table>
		        <tr>
	            <th>Nome</th>
	            <th>Endereço</th>
	            <th>Complemento</th>
	            <th>Cidade</th>
	            <th>Bairro</th>
	            <th>Numero</th>
	            <th>CEP</th>
		        </tr>
		        <tr>
	            <td></td>
	            <td></td>
	            <td></td>
	            <td></td>
	            <td></td>
	            <td></td>
	            <td></td>
		        </tr>
		      </table>
				</div>
	      <button type="button" class="btn_login" onclick="abrirModal();">Cadastrar Novos Locais</button>
	    </div>
	  </div>
	</form>
	<!-- Estrutura do modal -->
	<div id="modal" class="modal-cadastro">
				<a class="close" onclick="abrirModal();">X</a>
		<form id="login-box" name="formulario" onsubmit="return validaInfo()">
			<div id="goibada" class="login-box-interno">
				<div id="login-box-label">
					<h1> Endereço </h1>
				</div>
				<div class="login-form">
					<fieldset>
	    			<legend>Dados do endereço:</legend>
						<div class="control-group">
							<div class="form-divs">
								<label for="input-usuario">Nome:</label>
								<input name="Nome" type="text" placeholder="Nome" class="login-field" id="input-usuario"/>
							</div>
							<div>
								<div class="form-divs">
								<label for="input-usuario">Endereço:</label>
								<input name="Endereço" type="text" placeholder="Endereço" class="login-field" id="input-usuario" />
								</div>
								<div class="form-divs">
								<label for="input-usuario">Complemento:</label>
								<input name="Complemento" type="text" placeholder="Complemento" class="login-field" id="input-usuario"/>
								</div>
								<div class="form-divs">
								<label for="input-usuario">Cidade:</label>
								<input name="Cidade" type="text" placeholder="Cidade" class="login-field" id="input-usuario" />
								</div>
								<div class="form-divs">
								<label for="input-usuario">Estado:</label>
								<input name="Estado" type="text" placeholder="Estado" class="login-field" id="input-usuario" />
								</div>
							</div>
							<div>
								<div class="form-divs">
								<label for="input-usuario">Bairro:</label>
								<input name="Bairro" type="text" placeholder="Bairro" class="login-field" id="input-usuario"/>
								</div>
								<div class="form-divs">
								<label for="input-usuario">Numero:</label>
								<input name="Numero" type="text" placeholder="Numero" class="login-field" id="input-usuario" />
								</div>
								<div class="form-divs">
								<label for="input-usuario">CEP:</label>
								<input name="CEP" type="text" placeholder="CEP" class="login-field" id="input-usuario" />
								</div>
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