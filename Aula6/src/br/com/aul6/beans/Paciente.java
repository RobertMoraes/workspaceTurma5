package br.com.aul6.beans;

public class Paciente {
	private String nome;
	private String cpf;
	private String fone;

	//Construtor
	public Paciente(String nome, String cpf, String fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	
	//Getters Setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	// Metodos
	
	public void pesquisar() {
		System.out.println("Chamou a pesquisa..");
	}
	public void salvar() {
		System.out.println("Chamou salvar..");
	}
	public void excluir() {
		System.out.println("Chamou excluir..");
	}
	
	
	
}
