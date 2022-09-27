<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"   %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Java standard Taglib</title>
</head>
<body>
<h1>As empresas cadastradas são:</h1>

<ul>
	<forEach>
	
	
	
	</forEach>
</ul>





	<ul>
	<% 
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresa : lista){ %>
		<li >
		<%= empresa.getNome() 	%> 
		<li>;
		<% 
		}
		%>
	
	</ul>
	

</body>
</html>