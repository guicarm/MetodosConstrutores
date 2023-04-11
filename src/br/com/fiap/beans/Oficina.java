package br.com.fiap.beans;

public class Oficina {

	private String nome;
	private String cnpj;
	private Carro carro;
	private Endereco endereco;
	private Colaborador colaborador;
	
// ======================== CONSTRUTOR VAZIO & CONSTRUTOR CHEIO =========================================

	public Oficina() {
		super();
	}
	
	public Oficina(String nome, String cnpj, Carro carro, Endereco endereco, Colaborador colaborador) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.carro = carro;
		this.endereco = endereco;
		this.colaborador = colaborador;
	}
	
// ======================== CONSTRUTOR COM ATRIBUTOS DA PRÓPRIA CLASSE =========================================
		
	public Oficina(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
// ========================================= SETTERS & GETTERS =========================================
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
