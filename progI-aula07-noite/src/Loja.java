import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loja {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("123456", "Victor", "victor@email.com");
//		c1.nome = "Victor";
//		c1.email = "victor@email.com";
//		c1.cpf = "123456";
		
		//c1.getTotalClientes();
		Cliente.getTotalClientes();
		
		Funcionario f1 = new Funcionario(77666, "Ana", "ana@email.com");
//		f1.nome = "Ana";
//		f1.matricula = 77666;
//		f1.cpf = "987665";
		
		Produto p1 = new Produto();
//		p1.codigo = 1234;
//		p1.nome = "Notebook";
//		p1.marca = "Samsung";
//		p1.preco = 2800;
//		p1.quantidade = 57;
		
		p1.setCodigo(1234);
		p1.setNome("Notebook");
		p1.setMarca("Samsung");
		p1.setPreco(2800);
		p1.setQuantidade(57);
		
		Vendas v1 = new Vendas();
//		v1.cliente = c1;
//		v1.funcionario = f1;
//		v1.produto = p1;
//		v1.quantidade = 3;
//		//v1.dataDaCompra = LocalDate.now();
//		v1.dataDaCompra = LocalDate.of(2020, 3, 18);
		
		v1.setCliente(c1);
		v1.setFuncionario(f1);
		v1.setProduto(p1);
		v1.setQuantidade(3);
		v1.setDataDaCompra(LocalDate.now());
		
		//Vendas.getTotalVendas();
		//v1.getTotalVendas();
		
		System.out.println("Cliente: " + c1.getNome());
		System.out.println("Funcionario: " + f1.getNome());
		System.out.println("Produto: " + p1.getNome());
		System.out.println("Preço unitario: " + p1.getPreco());
		System.out.println("Valor total: " + (p1.getPreco() * v1.getQuantidade()));
		//System.out.println("Data da compra: " + v1.dataDaCompra);
		//dia/mes/ano
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		System.out.println("Data da compra: " + v1.getDataDaCompra().format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
	}
}
