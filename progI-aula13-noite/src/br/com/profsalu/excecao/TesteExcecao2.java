package br.com.profsalu.excecao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TesteExcecao2 {

	public static void main(String[] args) throws FileNotFoundException{
		lerArquivo();
		System.out.println("Fim do programa");
	}
	
	public static void lerArquivo() throws FileNotFoundException{
		FileInputStream input = new FileInputStream("arquivo.txt");
	}
}
