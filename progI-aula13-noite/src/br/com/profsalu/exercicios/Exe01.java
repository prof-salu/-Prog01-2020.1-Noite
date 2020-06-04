package br.com.profsalu.exercicios;

public class Exe01 {

	public static void main(String[] args) {
		int[] vetor = new int[] {2, 4, 6, 8, 10, 12};// 0-5
		for (int i = 0; i <= 12; i++) {
			try {
				System.out.println(vetor[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: " + e);
			}finally {
				System.out.println("Fim do programa");
			}
		}
	}
}
