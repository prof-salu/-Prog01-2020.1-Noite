
public class Cd extends Produto{
	private int numeroDeFaixas;
	
	public Cd(String codigoDeBarras, String nome, double preco, int numeroDeFaixas) {
		super(codigoDeBarras, nome, preco);
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	public int getNumeroDeFaixas() {
		return this.numeroDeFaixas;
	}
	
	public void setNumeroDeFaixas(int numeroDeFaixas) {
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	@Override
	public String toString() {
		return "CD[codigo de barras : " + getCodigoDeBarras() + 
				", nome: " + getNome() + ", preço: " + getPreco() + 
				", faixas: " + getNumeroDeFaixas() + "]";
	}
}
