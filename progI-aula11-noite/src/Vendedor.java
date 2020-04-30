
public class Vendedor extends Mensalista{
	private double comissao;
	private double totalVendas;
	
	public double getComissao() {
		return this.comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double totalVendas() {
		return this.totalVendas;
	}
	
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	@Override
	public double calcularSalario() {
		return getSalario() + (totalVendas * comissao);
	}
}
