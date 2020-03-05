import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		// Escreva um programa que leia um número inteiro (variável CODIGO). 
		// Verificar se o código é igual a 1, igual a 2 ou igual a 3. 
		// Caso não seja, apresentar a mensagem “Código inválido”. 
		// Ao ser verificado o código e constatado que é um valor válido,
		// o programa deve verificar cada código em separado para determinar seu valor 
		// por extenso, ou seja, apresentar a mensagem “um”, ”dois” ou “três”.
		
		Scanner teclado = new Scanner(System.in);
		int codigo = 0;
		
		System.out.println("Informe o codigo: ");
		codigo = teclado.nextInt();
		teclado.close();
		switch(codigo) {
			case 1:
				System.out.println("UM");
				break;
			case 2:
				System.out.println("DOIS");
				break;
			case 3:
				System.out.println("TRÊS");
				break;
			default:
				System.out.println("CODIGO INVALIDO");
		}
		

	}

}
