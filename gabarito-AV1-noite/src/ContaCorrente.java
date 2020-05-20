
public class ContaCorrente extends Conta{
	private double limite;
	private double taxa;
	
	public ContaCorrente(int numero, int agencia, Titular titular) {
		super(numero, agencia, titular);
		//this.limite = 1000;
		//this.taxa = 0.50;
		setLimite(1000);
		setTaxa(0.50);		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double getSaldoComLimite() {
		return getSaldo() + getLimite();
	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= getSaldoComLimite()) {
			saldo -= (valor + getTaxa()); 
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += (valor - getTaxa());
			return true;
		}else {
			return false;
		}
	}
}
