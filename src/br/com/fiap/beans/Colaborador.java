package br.com.fiap.beans;

public class Colaborador {
	
	private String nome;
	private String cargo;
	private int idade;
	private double valorHora;

// ======================== CONSTRUTOR VAZIO & CONSTRUTOR CHEIO =========================================	

	public Colaborador() {
		super();
	}
	
	public Colaborador(String nome, String cargo, int idade, double valorHora) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.valorHora = valorHora;
	}
// ========================================= SETTERS & GETTERS =========================================
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	

}
