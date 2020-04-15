
public class ContaCorrente {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) {
		if(valor <= saldo && valor > 0) {
			//Taxa de saque é 0.5%
			double taxa = valor * 0.005; 
			saldo = (saldo - valor) - taxa;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}

	// Formatar ==> CTRL+SHIFT+F
	public void depositar(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
		}else {
			System.out.println("Valor inválido!");
		}
	}
}
