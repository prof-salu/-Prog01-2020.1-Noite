package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscritaArquivo1 {

	public static void main(String[] args) throws IOException {
		File caminhoArquivo = new File("D:\\arquivos\\linguagens.txt");
		
		OutputStream os = new FileOutputStream(caminhoArquivo);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Javascript\n");
		bw.write("HTML\n");
		bw.write("SQL\n");
		bw.write("C#" + "\n");
		bw.write("Python\n");
		
		bw.close();
		osw.close();
		os.close();
	}
}
