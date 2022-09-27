package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
	PrintWriter out = response.getWriter();
	
	out.println("<html><body>");
	out.println("<h1>A empresa cadastrada é:</h1>");
	out.println("<ul>");
	for (Empresa empresa : lista) {
		out.println("<li>" + empresa.getNome() + "<li>");
	}
	out.println("</ul>");
	out.println("</html></body>");
	
	
		
	}

}
