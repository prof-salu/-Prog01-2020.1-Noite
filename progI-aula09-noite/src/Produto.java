
public class Produto {
	private String codigoDeBarras;
	private String nome;
	private double preco;
	
	public Produto(String codigoDeBarras, String nome, double preco) {
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getCodigoDeBarras() {
		return this.codigoDeBarras;
	}
	
	public void SetCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Produto)) {
			return false;
		}
		
		Produto outroProduto = (Produto) obj;
		
		if(this.getCodigoDeBarras() == outroProduto.getCodigoDeBarras()) {
			//System.out.println("São produtos iguais");
			return true;
		}else {
			return false;
		}
	}
}