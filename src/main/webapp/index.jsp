
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuestionario</title>
        <link href="estilo.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="container">

            <div id="formulario">
                 
                <div id="contendor">
                     <h1>Registro</h1>
                <form action="Control" method="post">
                    <div>
                        <label>
                            Nombres:
                        </label>
                        <input type="text" name="txt_nombres" required/>
                    </div>
                    <div>
                        <label>
                            Telefono:
                        </label>
                        <input type="text" name="txt_telefono" required/>
                    </div>
                    <div>
                        <label>
                            Correo:
                        </label>
                        <input type="email" name="txt_email" required/>
                    </div>
                    <div>
                        <label>
                            Contraseña:
                        </label>
                        <input type="password" name="txt_contra" required/>
                    </div>
                    <div id="registro">
                    <input type="submit" name="btn_registrar" value="Registrar"/>
                    <input type="reset" name="btn_borrar" value="Borrar"/>
                    </div>
                </form>
                

                </div>
               
            </div>
        </div>
    </body>
</html>
