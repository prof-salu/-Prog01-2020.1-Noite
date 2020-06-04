package br.com.profsalu.excecao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteExcecao2 {

	public static void main(String[] args) {
		lerArquivo();
		System.out.println("Fim do programa");
	}
	
	public static void lerArquivo() {
		try {
			FileInputStream input = new FileInputStream("arquivo.txt");
		}catch(FileNotFoundException e) {
			System.out.println("Error: " + e);
		}catch(IOException e) {
			System.out.println("Error: " + e);
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
