package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LeituraArquivo1 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("java.txt");
			System.out.println(is.read());
			is.close();
			//ASCII
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
