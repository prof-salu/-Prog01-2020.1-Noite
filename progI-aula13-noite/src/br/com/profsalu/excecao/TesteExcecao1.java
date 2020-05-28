package br.com.profsalu.excecao;

import br.com.profsalu.modelo.Funcionario;

public class TesteExcecao1 {

	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		
//		try {
//			metodo1();
//		}catch(NullPointerException ex) {
//			System.out.println("ERROR: " + ex);
//		}
		
		System.out.println("Fim do main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo1");
		
		metodo2();
//		try {
//			metodo2();
//		}catch(NullPointerException ex) {
//			System.out.println("ERROR: " + ex);
//		}
		
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2(){
		System.out.println("Inicio do metodo2");
		Funcionario f = null;
//		//TRY-CATCH
//		try {
//			System.out.println(f.toString());
//		}catch(NullPointerException ex) {
//			System.out.println("ERROR: " + ex);
//		}
		System.out.println(f.toString());
		
		System.out.println("Fim do metodo2");
	}
}
