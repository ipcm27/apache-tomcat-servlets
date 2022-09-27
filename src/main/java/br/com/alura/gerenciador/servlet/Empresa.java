package br.com.alura.gerenciador.servlet;

public class Empresa {

	private String id;
	private String nome;
	
	
	
	
	
	public Empresa(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
