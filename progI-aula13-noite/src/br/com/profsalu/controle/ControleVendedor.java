package br.com.profsalu.controle;

import br.com.profsalu.modelo.Vendedor;
import br.com.profsalu.visao.VisaoVendedor;

public class ControleVendedor {
	private VisaoVendedor visao;
	private Vendedor modelo;
	
	public ControleVendedor() {
		visao = new VisaoVendedor();
		modelo = new Vendedor();
	}
	
	private String getNome() {
		String nome = visao.lerNome();
		
		if(nome.length() < 3) {
			System.out.println("O nome deve possuir mais que 2 caracteres");
		}
		return nome;
	}
	
	private double getSalario() {
		double salario = visao.lerSalario();
		
		if(salario > 10000) {
			System.out.println("O salario nao pode ser maior que o teto da empresa.");
		}
		return salario;
	}
	
	public Vendedor getVendedor() {
		modelo.setNome(getNome());
		modelo.setSalario(getSalario());
		visao.exibirVendedor(modelo);
		return modelo;
	}
}
