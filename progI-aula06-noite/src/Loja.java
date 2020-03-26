import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loja {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Victor";
		c1.email = "victor@email.com";
		c1.cpf = "123456";
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Ana";
		f1.matricula = 77666;
		f1.cpf = "987665";
		
		Produto p1 = new Produto();
		p1.codigo = 1234;
		p1.nome = "Notebook";
		p1.marca = "Samsung";
		p1.preco = 2800;
		p1.quantidade = 57;
		
		Vendas v1 = new Vendas();
		v1.cliente = c1;
		v1.funcionario = f1;
		v1.produto = p1;
		v1.quantidade = 3;
		//v1.dataDaCompra = LocalDate.now();
		v1.dataDaCompra = LocalDate.of(2020, 3, 18);
		
		System.out.println("Cliente: " + c1.nome);
		System.out.println("Funcionario: " + f1.nome);
		System.out.println("Produto: " + p1.nome);
		System.out.println("Preço unitario: " + p1.preco);
		System.out.println("Valor total: " + (p1.preco * v1.quantidade));
		//System.out.println("Data da compra: " + v1.dataDaCompra);
		//dia/mes/ano
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		System.out.println("Data da compra: " + v1.dataDaCompra.format(DateTimeFormatter.ofPattern("d/MMMM/yyyy")));
	}

}
