<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
    <script src="resources/js/script.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
	<title>Recursos</title>
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
				<h1> Recursos </h1>
			</div>
			<div class="login-form">
				<div style="height: 80%; width: 100%; overflow: auto;">
					<table>
		        <tr>
		          <th>Nome</th>
		          <th>Disponibilidade</th>
		          <th>Descri��o</th>
		        </tr>
		        <tr>
		          <td></td>
		          <td></td>
		          <td></td>
		        </tr>
		      </table>
				</div>
        <button type="button" class="btn_login" onclick="abrirModal();">Cadastrar Novos Recursos</button>
      </div>
		</div>
	</form>
	<!-- Estrutura do modal -->
	<div id="modal" class="modal-cadastro">
				<a class="close" onclick="abrirModal();">X</a>
		<form id="login-box" name="formulario" onsubmit="return validaInfo()">
			<div id="goibada" class="login-box-interno">
				<div id="login-box-label">
					<h1> Novo Recursos </h1>
				</div>
				<div class="login-form">
					<fieldset>
	    			<legend>Dados do endere�o:</legend>
						<div class="control-group">
							<div>
								<div class="form-divs">
								<label for="input-usuario">Nome:</label>
								<input name="Nome" type="text" placeholder="Nome" class="login-field" id="input-usuario"/>
								</div>
								<div class="form-divs">
								<label for="input-usuario">Disponibildade:</label>
								<input name="Disponibilidade" type="text" placeholder="Disponibilidade" class="login-field" id="input-usuario" />
								</div>
							</div>
							<div>
							<div class="form-divs">
								<label for="input-usuario">Descri��o:</label>
								<input name="Disponibilidade" type="text" placeholder="Descri��o" class="login-field" id="input-usuario" />
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