<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <div id="logo-nav">LOGO</div>
            <div id="texto-nav"><h1>Lunaris</h1></div> 
        </nav>
        <form id="login-box" name="formulario" onsubmit="return validaInfo()" action="" method="POST"> 
            <div class="login-box-interno"> 

                <div id="login-box-label"> 
                    <h1> Seja Bem-Vindo(a) </h1>
                </div>

                <div class="login-form">
                    <div class="input-div">
                        <div>
                            <input name="usuario" type="text" placeholder="Usuário" class="login-field" id="input-usuario" />
                        </div>
                    </div>

                    <div class="input-div">
                        <div>
                            <input name="senha" type="password" placeholder="Senha"  id="input-senha" />
                        </div>
                    </div>
                    <button type="submit" class="btn_login">Acessar</button>

                    <div id="msg_erro" class="login-link">
                        * Os campos de Usuário e Senha são obrigatórios
                    </div>

                    <a id="recover" class="login-link" href="#" >Esqueceu a senha?</a>

                    <!-- <button type="submit" class="btn_login">Acessar</button> -->

                </div>
            </div>
        </form>
        <div id="pao">
            <h1>ESTE É UM FUCKING TITULO, DE UMA FUCKING DIV</h1>
        </div>

    </body>
</html>