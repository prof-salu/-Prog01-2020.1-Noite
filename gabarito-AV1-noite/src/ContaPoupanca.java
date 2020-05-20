
public class ContaPoupanca extends Conta implements Rendimento{
	
	public ContaPoupanca(int numero, int agencia, Titular titular) {
		super(numero, agencia, titular);
	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= getSaldo()) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void atualizar(double taxaRendimento) {
		//1000 ==> 10 + 1000 ==> 1010
		// 0.01
		// 0.025
		//this.saldo += this.saldo * taxaRendimento;
		this.saldo = this.saldo + (this.saldo * taxaRendimento);
		
	}
	
}
