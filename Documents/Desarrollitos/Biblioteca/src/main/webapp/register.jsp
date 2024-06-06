<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="https://kit.fontawesome.com/dae2215d1f.js" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Expires" content="0">
        <meta http-equiv="Last-Modified" content="0">
        <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
        <meta http-equiv="Pragma" content="no-cache">
        <title>Tres Gatos colorados</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
        <link href="css/logres.css" rel="stylesheet"/>
        
    </head>
    <body>
        <section>
            <div class="contenedor">
                <div class="formulario">
                    <form action="#">
                        <h2>Registro</h2> 
                        <div class = "input-contenedor">
                            <i class="fas fa-regular fa-envelope"></i>
                            <input type="text" required>
                            <label for="#">Nombre</label>
                        </div>
                        <div class = "input-contenedor">
                            <i class="fas fa-regular fa-envelope"></i>
                            <input type="text" required>
                            <label for="#">Apellidos</label>
                        </div>
                        <div class = "input-contenedor">
                            <i class="fas fa-regular fa-envelope"></i>
                            <input type="email" required>
                            <label for="#">Email</label>
                        </div>
                        
                        <div class = "input-contenedor">
                            <i class="fa-solid fa-lock"></i>
                            <input type="password" required>
                            <label for="#">Contraseña</label>
                        </div>
                        <div class = "input-contenedor">
                            <i class="fa-solid fa-lock"></i>
                            <input type="password" required>
                            <label for="#">Repite la Contraseña</label>
                        </div>
                        <div class = "contenedor-chiquito">
                            <i class="fa-solid fa-lock"></i>
                            <select name="select" class="redondito">
                            <option value="value1">Cuenta?</option>
                            <option value="value2" selected>Cliente</option>
                            <option value="value3">Escritor</option>
                            </select>
                        </div>
                        
                        <div>
                        <button href="index.jsp">Acceder</button>
                         </div>
                    </form>
                    
                    
                </div>
            </div>
        </section>
    </body>
</html>