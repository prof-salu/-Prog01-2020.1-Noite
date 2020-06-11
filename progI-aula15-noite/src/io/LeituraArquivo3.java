package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeituraArquivo3 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("java.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
//			String linha = br.readLine();
//			String outraLinha = br.readLine();
//			String maisOutraLinha = br.readLine();
//			String ultimaLinha = br.readLine();
//			
//			
//			System.out.println(linha);
//			System.out.println(outraLinha);
//			System.out.println(maisOutraLinha);
//			System.out.println(ultimaLinha);
			
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}	
			
			is.close();
			isr.close();
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
