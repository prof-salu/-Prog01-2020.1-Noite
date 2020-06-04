package br.com.profsalu.controle;

import javax.swing.JOptionPane;

import br.com.profsalu.excecao.SalarioAcimaDoTetoException;
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
			throw new IllegalArgumentException("Nome deve possui pelo menos 3 caracteres");
		}
		return nome;
	}
	
	private double getSalario() {
		double salario = visao.lerSalario();
		
		try {
			if(salario > 10000) {
				throw new SalarioAcimaDoTetoException();
			}
			return salario;
		}catch(SalarioAcimaDoTetoException e) {
			JOptionPane.showMessageDialog(null, e);
			return getSalario();
		}		
	}
	
	public Vendedor getVendedor() {
		try {
			modelo.setNome(getNome());
		}catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e);
			modelo.setNome(getNome());
		}
		
		modelo.setSalario(getSalario());
		
		visao.exibirVendedor(modelo);
		return modelo;
	}
}
