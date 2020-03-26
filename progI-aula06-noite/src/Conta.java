
public class Conta {
	//Modificadores de acesso
		// default		--> Apenas classes do mesmo pacote tem acesso aos membros dessa classe
		// public 		--> Todas as classses do projeto tem acessso aos membros desssa classe
		// private		--> Apenas a própria classe consegue ter acesso aos membros
		// protected	--> Apenas classes do mesmo ou classses filhas tem acesso aos membros dessa classe
	
	private int numero;
	private String titular;
	private	double saldo;
	private double limite;
	//Variavel de classe
	private static int totalDeContas = 0;
	
	// Construtor vazio
//	public Conta() {
//		
//	}
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
		this.limite = 500;
		totalDeContas = totalDeContas + 1;
	}
	
	//Encapsulamento
	//GET e SET
		// get --> recupera o valor de uma propriedade
		// set --> altera o valor de uma propriedade
		// this --> aponta para própria classe
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}
	
	public boolean sacar(double valor) {
		if(valor <= (this.saldo + this.limite)) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			System.out.println("Valor invalido");
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo = this.saldo + valor;
			return true;
		}		
		return false;
	}
	
	public boolean transferir(double valor, Conta favorecido) {
		if(this.sacar(valor) == true) {
			favorecido.depositar(valor);
			return true;
		}
		return false;
	}
}
