
public class ClienteEspecial extends ContaCorrente{
	@Override
	public void sacar(double valor) {
		if(valor <= saldo && valor > 0) {
			//Taxa de saque é 0.1%
			double taxa = valor * 0.001;
			saldo = (saldo - valor) - taxa;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
}