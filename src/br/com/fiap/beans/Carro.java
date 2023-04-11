package br.com.fiap.beans;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private ParteCarro parteCarro;
	
// ======================== CONSTRUTOR VAZIO & CONSTRUTOR CHEIO =========================================

	public Carro() {
		super();
	}
	
	public Carro(String marca, String modelo, int ano, String placa, ParteCarro parteCarro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.parteCarro = parteCarro;
	}
// ======================== CONSTRUTOR COM ATRIBUTOS DA PRÓPRIA CLASSE =========================================

	public Carro(String marca, String modelo, int ano, String placa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}
// ========================================= SETTERS & GETTERS =========================================

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public ParteCarro getParteCarro() {
		return parteCarro;
	}
	public void setParteCarro(ParteCarro parteCarro) {
		this.parteCarro = parteCarro;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
