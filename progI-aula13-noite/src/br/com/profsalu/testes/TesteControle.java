package br.com.profsalu.testes;

import br.com.profsalu.controle.ControleVendedor;
import br.com.profsalu.modelo.Vendedor;

public class TesteControle {

	public static void main(String[] args) {
		ControleVendedor controle = new ControleVendedor();
		Vendedor vendedor = controle.getVendedor();

	}

}
