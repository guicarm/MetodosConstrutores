package br.com.fiap.beans;

public class Endereco {
	
	private String logradouro;
	private int numero;
	
// ======================== CONSTRUTOR VAZIO & CONSTRUTOR CHEIO =========================================	
	
	public Endereco() {
		super();
	}
	
	public Endereco(String logradouro, int numero) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
	}

// ========================================= SETTERS & GETTERS =========================================

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
