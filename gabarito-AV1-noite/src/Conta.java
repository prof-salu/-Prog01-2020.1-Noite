
public abstract class Conta {
	private int numero;
	private int agencia;
	protected double saldo;
	private Titular titular;

	public Conta(int numero, int agencia, Titular titular) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = 0;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public abstract boolean sacar(double valor);
	
	public abstract boolean depositar(double valor);
	
	public boolean transferir(double valor, Conta favorecido) {
		if(this.sacar(valor) == true) {
			favorecido.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

}
