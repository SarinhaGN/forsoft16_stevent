<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"/>
	<link rel="stylesheet" type="text/css" href="css/style.css">
    <script src="js/script.js"></script>
    <!-- <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet"> --> 
	<title>Organização de Equipes</title>
</head>
<body>
    <nav id="nave">
    <div id="logo-nav"> LOGO </div>
    <div id="texto-nav"><h1>Lunaris</h1></div> 
    </nav>
	<form id="login-box" name="formulario" onsubmit="return validaInfo()">
		<div id="goibada" class="login-box-interno">

			<div id="login-box-label">
				<h1> Organização de Equipes </h1>
			</div> 

			<div class="login-form">
                <div class="control-group">
                    
                    <table>
                    <tr>
                            <div>
                            <td>
                                <label for="atletas">Atleta(s):</label><br>
                                <select size="5" name="atletas" class="selecao" multiple>
                                        <option value="volvo">João</option>
                                        <option value="saab">Maria</option>
                                        <option value="opel">José</option>
                                </select>
                            </td>

                            <td align="center">
                            <button type="submit" class="btn_login">Enviar para a equipe >></button>
                            </td>

                            <td>
                                <label for="input-usuario">Equipe:</label><br>
                                    <select class="selecao" >
                                        <option value="volvo">1</option>
                                        <option value="saab">2</option>
                                        <option value="opel">3</option>
                                    </select>
                            </td>
                            </div>
                    </tr>
                    </table>
                    
                </div>
				
                <button type="submit" class="btn_login">Salvar</button>

            </div>
		</div>
	</form>
</body>
</html> 