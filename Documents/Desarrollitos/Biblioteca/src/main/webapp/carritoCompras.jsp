<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Tres Gatos Colorados Books</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
        <link href="css/tables.css" rel="stylesheet" />
</head>
<nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand" href="menuCliente.jsp"><img src="assets/img/navbar-pata.svg" alt="..." /></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars ms-1"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav text-uppercase ms-auto py-4 py-lg-0">
                        <li class="nav-item"><a class="nav-link" href="#services">Comprar</a></li>
                        <li class="nav-item"><a class="nav-link" href="#portfolio">Encargar</a></li>
                        <li class="nav-item"><a class="nav-link" href="registroTarjeta.jsp">Tarjeta</a></li>
                        <li class="nav-item"><a class="nav-link" href="login.jsp">Carrito</a></li>
                        <li class="nav-item"><a class="nav-link" href="login.jsp">Salir</a></li>
                    </ul>
                </div>
            </div>
</nav>

<body>
 <div id="wrapper">
  <h1>Consulta tus ventas en proceso</h1>
  
  <table id="keywords" cellspacing="0" cellpadding="0">
    <thead>
      <tr>
        <th><span>Número de Venta</span></th>
        <th><span>Productos</span></th>
        <th><span>Cantidades</span></th>
        <th><span>Monto</span></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td class="lalign">1</td>
        <td>Vientos de invierno</td>
        <td>2</td>
        <td>110</td>
      </tr>
    </tbody>
  </table>
 </div> 
</body>
<%@include file="components/foot.jsp"%>
</html>