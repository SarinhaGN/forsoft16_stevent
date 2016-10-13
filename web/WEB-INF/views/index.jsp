<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
    <script src="resources/js/script.js"></script>
     <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
	<title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
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
	<div id="center">
		<form id="login-box-1" name="formulario" onsubmit="return validaInfo()">
			<div class="login-box-interno" style='float:left;'>

				<div id="login-box-label">
					<h1> Seja Bem-Vindo(a) </h1>
				</div>

				<div class="login-form">
					<div class="input-div">
						<div>
							<input name="usuario" type="text" placeholder="Usu�rio" class="login-field" id="input-usuario" />
						</div>
					</div>

					<div class="input-div">
						<div>
							<input name="senha" type="password" placeholder="Senha"  id="input-senha" />
						</div>
					</div>
					<button type="submit" class="btn_login">Acessar</button>

					<div id="msg_erro" class="login-link">
						* Os campos de Usu�rio e Senha s�o obrigat�rios
					</div>

					<a id="recover" class="login-link" href="#" >Esqueceu a senha?</a>

					<!-- <button type="submit" class="btn_login">Acessar</button> -->

				</div>
			</div>
		 </form>
		 <div id="pao">
			 <h1>STEEVE - Sistema de Eventos Esportivos</h1><br>
			 <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sit amet lorem ac mauris vehicula sagittis nec nec sapien. Quisque semper, elit sit amet pharetra ullamcorper, mauris lacus congue ipsum, ac aliquam orci diam vitae urna. Sed ut tincidunt felis. Donec nunc odio, egestas et tristique mattis, iaculis at ligula. Maecenas efficitur nisl vel lacus varius consectetur. Phasellus vel rhoncus arcu, sed venenatis leo. Suspendisse potenti. Sed convallis enim vel mollis dapibus. Praesent venenatis neque libero, in lobortis turpis interdum a. Cras et enim at elit hendrerit fringilla. Nam non ultrices nisi. Donec maximus ultrices lorem, vel pellentesque massa luctus et. Vestibulum eu efficitur tellus, nec feugiat mauris. Duis a erat diam. Proin quis convallis odio, eu consequat sapien. Ut eu turpis porta, ullamcorper nunc ac, malesuada nunc.</p>
		 </div>
	</div>

</body>
</html>
