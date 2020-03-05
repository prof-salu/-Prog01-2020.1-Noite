import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		// Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e mostre
		// o nome da pessoa mais velha e o nome da pessoa mais nova.
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, idadeMaisNovo = 0, idadeMaisVelho = 0;
		String nome = null, nomeMaisNovo = null, nomeMaisVelho = null;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o seu nome: ");
			nome = entrada.next();
			
			System.out.println("Informe a sua idade: ");
			idade = entrada.nextInt();
			
			if(i == 0) {
				idadeMaisNovo = idade;
				idadeMaisVelho = idade;
				nomeMaisNovo = nome;
				nomeMaisVelho = nome;
			}
			
			if(idade < idadeMaisNovo) {
				idadeMaisNovo = idade;
				nomeMaisNovo = nome;
			}
			
			if(idade > idadeMaisVelho) {
				idadeMaisVelho = idade;
				nomeMaisVelho = nome;
			}
		}
		
		entrada.close();
		
		System.out.println("Pessoa mais nova: " + nomeMaisNovo);
		System.out.println("Pessoa mais velha: " + nomeMaisVelho);

	}

}
