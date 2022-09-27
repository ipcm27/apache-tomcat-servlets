package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa("Caelum","1");
		Empresa empresa2 = new Empresa("Alura","2");
		
		lista.add(empresa2);
		lista.add(empresa1);
	}

	public void adicionar(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
