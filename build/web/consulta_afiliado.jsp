<%@page import = "apis.afiliadoAPI" %>

<jsp:useBean id="afiliado" scope="session" class="apis.afiliadoAPI">
            <jsp:setProperty name="afiliado" property="*" />
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
                String cAfiliado = request.getParameter("cAfiliadoAfiliado");
                String fNacimiento = request.getParameter("fNacimientoAfiliado");
                afiliadoAPI c_api = new afiliadoAPI();
                salida = c_api.getAfiliado(cAfiliado,fNacimiento);        
                    
            %>
            <h3><%=salida%></h3>
       
        <a class="button" href="index.jsp">Aceptar</a>
    </div>
</body>
</html>