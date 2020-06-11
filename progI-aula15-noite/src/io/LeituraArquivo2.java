package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeituraArquivo2 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("java.txt");
			InputStreamReader isr = new InputStreamReader(is);
			char c = (char) isr.read();
			System.out.println(c);
			//ASCII
			
			is.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
