package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EscritaArquivo2 {

	public static void main(String[] args) throws IOException {
		String usuario = System.getProperty("user.name");
		File localArquivo = new File("C:\\Users\\" + usuario + "\\Desktop\\lista.txt");
		
		OutputStream os = new FileOutputStream(localArquivo);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lista de compras: ");
		String item = sc.nextLine();
		
		while(!item.equals("FIM")) {
			bw.write(item + "\n");
			item = sc.nextLine();
		}
		
		System.out.println("Encerrando a gravacao");
		sc.close();
		bw.close();
		osw.close();
		os.close();
	}
}
