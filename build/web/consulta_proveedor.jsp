<%@page import = "apis.proveedorAPI" %>

<jsp:useBean id="proveedor" scope="session" class="apis.proveedorAPI">
            <jsp:setProperty name="proveedor" property="*" />
</jsp:useBean>

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
            <%
                String salida="";
                String cProveedor = request.getParameter("nProveedor");
                String nAfiliado = request.getParameter("cAfiliado");
                String fNacimientoN = request.getParameter("fNacimiento");
                String fCoberturaN = request.getParameter("fCobertura");
                proveedorAPI c_api = new proveedorAPI();
                salida = c_api.getProveedor(cProveedor, nAfiliado, fNacimientoN, fCoberturaN);
                    
            %>
            <h3><%=salida%></h3>
       
        <a class="button" href="index.jsp">Aceptar</a>
    </div>
</body>
</html>