package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer ChaveSequencial =1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(ChaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa.setId(ChaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(ChaveSequencial++);
		Banco.lista.add(empresa);
	}
	
	public void removeEmpresa(Integer id) {
		
		
//		Utiliza esse interface para editar uma lista enqunato eprcorre ela
		Iterator<Empresa> it = lista.iterator();
		
		
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		
	}
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
