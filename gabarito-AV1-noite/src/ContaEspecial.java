
public class ContaEspecial extends ContaCorrente implements Rendimento{

	public ContaEspecial(int numero, int agencia, Titular titular) {
		super(numero, agencia, titular);
		setLimite(5000);
		setTaxa(0.25);
	}
	
	@Override
	public void atualizar(double taxaRendimento) {
		this.saldo += this.saldo * taxaRendimento;	
	}
}
