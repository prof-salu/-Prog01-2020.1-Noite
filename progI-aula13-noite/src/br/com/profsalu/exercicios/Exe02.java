package br.com.profsalu.exercicios;

public class Exe02 {

	public static void main(String[] args) {
		try {
			metodo01();
		}catch(ArithmeticException e) {
			System.out.println("Error: " + e);
		}
		
		try {
			metodo02();
		}catch(NullPointerException e) {
			System.out.println("Error: " + e);
		}
		
		metodo03();
		
		System.out.println("FIM DO PROGRAMA!");
		
	}

	public static void metodo01() {
		int numA = 5;
		int numB = 0;
		System.out.println(numA / numB);
	}

	public static void metodo02() {
		Object objeto = null;
		System.out.println(objeto.toString());
	}

	public static void metodo03() {
		try {
			throw new IllegalArgumentException("Algo esta errado.");
		}catch (IllegalArgumentException e){
			System.out.println("Error: " + e);
		}
	}
}
