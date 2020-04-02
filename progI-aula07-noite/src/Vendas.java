import java.time.LocalDate;

public class Vendas {
	private Cliente cliente;
	private Funcionario funcionario;
	private Produto produto;
	private int quantidade;
	private LocalDate dataDaCompra;
	private static int totalVendas = 0;
	
	public Vendas(Cliente cliente, Funcionario funcionario, Produto produto, int quantidade, LocalDate dataDaCompra) {
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataDaCompra = dataDaCompra;
		Vendas.totalVendas++;
	}

	public Vendas() {
		Vendas.totalVendas++;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(LocalDate dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}

	public static int getTotalVendas() {
		return totalVendas;
	}
}
