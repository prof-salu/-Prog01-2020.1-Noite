package br.com.profsalu.testes;

import br.com.profsalu.modelo.Vendedor;
import br.com.profsalu.visao.VisaoVendedor;

public class TestaVisao {

	public static void main(String[] args) {
		VisaoVendedor visao = new VisaoVendedor();
		Vendedor v = new Vendedor();
		v.setNome(visao.lerNome());
		v.setSalario(visao.lerSalario());
		
		visao.exibirVendedor(v);
	}

}
