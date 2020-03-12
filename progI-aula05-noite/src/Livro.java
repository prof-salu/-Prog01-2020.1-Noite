
public class Livro {
	String titulo;
	Autor autor;
	double valor;
	String isbn;
	
	//Com retorno ou sem retorno
	//Com parametro e sem parametro
	
	//Funcoes sem retorno
	
	void exibeInformacao() {
		System.out.println("Título:" + titulo);
		//autor.exibeInformacao();
		System.out.println("Valor: R$" + valor);
		System.out.println("ISBN: " + isbn);
	}
	
	//Funcoes com retorno
	
	boolean temAutor() {
//		if(autor == null) {
//			return false;
//		}else {
//			return true;
//		}
		
		return autor != null;
	}
	
	//Com parametro
	void aplicarDesconto(double desconto) {
		System.out.println("Valor atual: " + valor);
		valor = valor - (valor * desconto);
		System.out.println("Valor do desconto: " + (valor * desconto));
		System.out.println("Valor com desconto: " + valor);
	}
}








