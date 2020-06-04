package br.com.profsalu.excecao;

import br.com.profsalu.modelo.Funcionario;

public class TesteExcecao1 {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
			
		System.out.println("Fim do main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo1");
		
		metodo2();
		
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2(){
		System.out.println("Inicio do metodo2");
		Funcionario f = null;
		try {
			System.out.println(f.toString());
		}catch(NullPointerException e) {
			System.out.println("Error: " + e);
		}
		System.out.println("Fim do metodo2");
	}
}
