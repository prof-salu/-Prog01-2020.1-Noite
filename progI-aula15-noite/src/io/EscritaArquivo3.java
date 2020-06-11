package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivo3 {

	public static void main(String[] args) throws IOException {
		String usuario = System.getProperty("user.name");
		File localArquivo = new File("C:\\Users\\" + usuario + "\\Desktop\\lista.txt");
		
//		JFileChooser path = new JFileChooser();
//		path.setFileSelectionMode(JFileChooser.FILES_ONLY);
//		path.showSaveDialog(null);
//		File localArquivo = path.getSelectedFile().getAbsoluteFile();

		InputStream is = new FileInputStream(localArquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		ArrayList<String> lista = new ArrayList<String>();
		String item = br.readLine();

		while (item != null) {
			lista.add(item);
			item = br.readLine();
		}

		br.close();
		isr.close();
		is.close();
		
		System.out.println("Lista de compras: ");
		for (String itemlista : lista) {
			System.out.println(itemlista);
		}
		
		System.out.println();
		
		System.out.println("Novos itens: ");
		Scanner sc = new Scanner(System.in);
		item = sc.nextLine();

		while (!item.equals("FIM")) {
			lista.add(item);
			item = sc.nextLine();
		}

		OutputStream os = new FileOutputStream(localArquivo);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (String itemlista : lista) {
			bw.write(itemlista + "\n");
		}

		sc.close();
		bw.close();
		osw.close();
		os.close();
		
		System.out.println("Gravacao encerrada");
	}
}
