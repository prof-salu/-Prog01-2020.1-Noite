import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// Faça um programa que:
		// - Leia a cotação do dólar
		// - Leia um valor em dólares
		// - Converta esse valor para Real
		// - Mostre o resultado
		
		Scanner entrada = new Scanner(System.in);
		double cotacaoDolar;
		double valorDolar;
		double valorReal;
		
		System.out.println("Informe a cotação do dia: ");
		cotacaoDolar = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de Dolares: ");
		valorDolar = entrada.nextDouble();
		
		entrada.close();
		
		valorReal = cotacaoDolar * valorDolar;
		
		//O valor US$ ??? convertido em Reais é de R$ ????
		
		System.out.printf("O valor US$ %.2f convertido em Reais é de R$ %.2f", valorDolar, valorReal);		

	}

}
