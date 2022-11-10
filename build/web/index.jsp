<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <title>Mi Buen Seguro : Pagina Principal</title>
</head>
<body>
    
    <h1>Consultas Mi Buen Seguro,s.a</h1>
<div class="container">
    <div class="leftContainer">
        <!--contenedor donde se ubicara la busqueda por proveedor--> 
        <h3>Busqueda por Proveedor</h3>
        <form action="#" method="post">
            <div class="fila">
                <label for="nProveedor">Nit de Proveedor:</label>
                <input type="number" id="nProveedor" required>
            </div>
            <div class="fila">
                <label for="cAfiliado">Código de afiliado:</label>
                <input type="number" id="cAfiliado" required>
            </div>
            <div class="fila">
                <label for="fNacimiento">Fecha Nacimiento:</label>
                <input type="date" id="fNacimiento" min="1920-01-01" required>
            </div>
            <div class="fila">
                <label for="fCobertura">Fecha Cobertura:</label>
                <input type="date" id="fCobertura" min="1920-01-01" required>
            </div>
            <br>
            <br>
            <button class="button_proveedor">Consultar</button>
        </form>
    </div>
    <br>
    <br>
    <div class="rightContainer">
      <!--Contenedor donde se ubicara la busqueda por afiliado-->
      <h3>Busqueda por Afiliado</h3>
      <form action="#" method="post">
        <div class="fila">
            <label for="cAfiliado">Código de afiliado</label>
            <input type="text" id="cAfiliadoAfiliado" required>
        </div>
        <div class="fila">
            <label for="fNacimiento">Fecha de Nacimiento</label>
            <input type="date" id="fNacimientoAfiliado" min="1920-01-01" required>
        </div>
        <br>
        <br>
        <button class="button_afiliado">Consultar</button>
    </form>
    </div>
</div>
</body>
<footer>
    <p>Proyecto no. 3.</p>
    <p>Desarrollo Web</p>
</footer>
</html>