package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Oficina;
import br.com.fiap.beans.ParteCarro;

public class Teste {

	public static void main(String[] args) {
		
//===================== INSTÂNCIAR OBJETOS =====================


		
		Oficina objOficina = new Oficina(JOptionPane.showInputDialog("Nome da oficina: "),
				JOptionPane.showInputDialog("CNPJ: "));
		
		
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Logradouro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Número do endereço: ")));
		
		
		Carro objCarro = new Carro(JOptionPane.showInputDialog("Marca do carro: "),
				JOptionPane.showInputDialog("Modelo do carro: "),
				Integer.parseInt(JOptionPane.showInputDialog("Ano do carro: ")),
				JOptionPane.showInputDialog("Placa do carro: "));
		
		
		ParteCarro objParteCarro = new ParteCarro(JOptionPane.showInputDialog("Motor do carro: "),
				JOptionPane.showInputDialog("Tipo de combustível: "),
				JOptionPane.showInputDialog("Roda: "));
		
		
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Nome: "),
				JOptionPane.showInputDialog("Cargo: "),
				Integer.parseInt(JOptionPane.showInputDialog("Idade: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor por hora: ")));
		
//===================== GETTERS =====================
		
		System.out.println("Nome da oficina: " +  objOficina.getNome() +
				"\nCNPJ: " + objOficina.getCnpj() +
				"\n=========== ENDEREÇO ===========" +
				"\nLogradouro: " + objOficina.getEndereco().getLogradouro() +
				"\nNúmero: " + objOficina.getEndereco().getNumero() +
				"\n=========== CARRO ============" +
				"\nMarca: " + objOficina.getCarro().getMarca() +
				"\nModelo: " + objOficina.getCarro().getModelo() +
				"\nAno: " + objOficina.getCarro().getAno() +
				"\nPlaca: " + objOficina.getCarro().getPlaca() +
				"\nMotor: " + objOficina.getCarro().getParteCarro().getMotor() +
				"\nTipo de combustível: " + objOficina.getCarro().getParteCarro().getCombustivel() +
				"\nRoda: " + objOficina.getCarro().getParteCarro().getRoda() + 
				"\n=========== COLABORADOR =============" +
				"\nNome: " + objOficina.getColaborador().getNome() +
				"\nCargo: " + objOficina.getColaborador().getCargo() +
				"\nIdade: " + objOficina.getColaborador().getIdade() +
				"\nValor por hora: " + objOficina.getColaborador().getValorHora());
		
// OBJETO DE ATRIBUTO DE REFERÊNCIA: OFICINA
		objOficina.setCarro(objCarro);
		objOficina.setEndereco(objEndereco);
		objOficina.setColaborador(objColaborador);
		
// OBJETO DE ATRIBUTO DE REFERÊNCIA: CARRO
		objCarro.setParteCarro(objParteCarro);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
