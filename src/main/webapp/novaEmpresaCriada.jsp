<%
    String nomeEmpresa = (String)request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
    %>
<!-- JavaServer Pages #scriplet -->   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Empresa  ${ nomeEmpresa } a cadastrada com sucesso
</body>
</html>