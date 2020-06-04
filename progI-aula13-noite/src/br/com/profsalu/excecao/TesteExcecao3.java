package br.com.profsalu.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcecao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("Informe um numero: ");
		
		try {
			x = sc.nextInt();
			System.out.println("Numero informado: " + x);
		}catch(InputMismatchException e) {
			System.out.println("ERROR: " + e);
		}finally {			
			sc.close();
			System.out.println("Fim do programa");
		}
	}
}
