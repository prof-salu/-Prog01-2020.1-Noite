import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		// Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu 
		// antecessor e seu sucessor.
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("Numero digitado: " + numero);
		System.out.println("Antecessor: " + (numero - 1));
		System.out.println("Sucessor: " + (numero + 1));
	}
}
