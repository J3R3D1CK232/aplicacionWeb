<%@page import = "apis.proveedorAPI" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="exito.css">
    <title>Mi Buen Seguro : Resultado Consulta</title>
</head>
<body>
    <div class="container">
        <h1>Resultado de la Consulta</h1>
        <h3>El afiliado se encuentra:</h3>
        <p>
            <%
                proveedorAPI api_c = new proveedorAPI();
                System.out.println(api_c.get());                
            %>
        </p>
        <a class="button" href="index.jsp">Aceptar</a>
    </div>
</body>
</html>