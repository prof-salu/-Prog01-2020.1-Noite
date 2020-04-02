
public class Produto {
	private int codigo;
	private String nome;
	private String marca;
	private int quantidade;
	private double preco;
	private static int totalProdutos = 0;
	
	public Produto(int codigo, String nome, String marca, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.quantidade = quantidade;
		this.preco = preco;
		Produto.totalProdutos++;
	}

	public Produto() {
		Produto.totalProdutos++;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}
}
