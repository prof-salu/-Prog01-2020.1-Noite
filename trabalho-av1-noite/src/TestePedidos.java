import java.time.LocalDate;

public class TestePedidos {

	public static void main(String[] args) {
		//JDBC
		
		Cliente cliente = new Juridica("Empresa XYZ", "xyz@email.com", "1234", "987654321");
		Vendedor vendedor = new Vendedor("Ana", "ana@email.com", "6677", LocalDate.of(2001, 1, 1));
		Produto produto = new Hardware("Teclado", 30, "998865");
		ItemDePedido itemDePedido = new ItemDePedido(20, produto);
		
		Pedido p1 = new Pedido(LocalDate.now(), cliente, vendedor, itemDePedido);
		
		System.out.println(cliente.validarLogin("xyz@gmail.com", "1234"));
		
		System.out.println(cliente.validarLogin("xyz@email.com", "1234"));

	}

}
