
public class Dvd extends Produto{

	private int duracao;
	
	public Dvd(String codigoDeBarras, String nome, double preco, int duracao) {
		super(codigoDeBarras, nome, preco);
		this.duracao = duracao;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "DVD[codigo de barras: " + getCodigoDeBarras() + 
				", nome: " + getNome() + ", preço: " + getPreco() +
				", duração: " + getDuracao() + "]";
	}
	
}
