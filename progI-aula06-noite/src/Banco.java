
public class Banco {

	public static void main(String[] args) {
		Conta c1 = new Conta(1234, "Bill");
		System.out.println("Total de contas criadas: " + Conta.getTotalDeContas());
		Conta c2 = new Conta(5678, "Ana");
		System.out.println("Total de contas criadas: " + Conta.getTotalDeContas());
		Conta c3 = new Conta(7777, "Carlos");
		System.out.println("Total de contas criadas: " + Conta.getTotalDeContas());
		Conta c4 = new Conta(8899, "Bia");
		System.out.println("Total de contas criadas: " + Conta.getTotalDeContas());
		
		System.out.println();
//		c1.setNumero(1234);
//		c1.setTitular("Bill");
//		//c1.setSaldo(200);
//		c1.setLimite(500);
		
		
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Conta: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		System.out.println();
		
		System.out.println("Titular: " + c2.getTitular());
		System.out.println("Conta: " + c2.getNumero());
		System.out.println("Saldo: " + c2.getSaldo());
		System.out.println("Saldo total: " + (c2.getSaldo() + c2.getLimite()));
		
		c1.sacar(300);
		
		//c1.setSaldo(-3000);
		
		System.out.println();
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Conta: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		c1.sacar(500);
		
		System.out.println();
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Conta: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		c1.depositar(700);
		
		System.out.println();
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Conta: " + c1.getNumero());
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		System.out.println("Transferencias...");
		System.out.println("C1 Saldo: " + c1.getSaldo());
		System.out.println("C1 Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		System.out.println("C2 Saldo: " + c2.getSaldo());
		System.out.println("C2 Saldo total: " + (c2.getSaldo() + c2.getLimite()));
		
		c1.transferir(200, c2);
		System.out.println();
		System.out.println("C1 Saldo: " + c1.getSaldo());
		System.out.println("C1 Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		System.out.println("C2 Saldo: " + c2.getSaldo());
		System.out.println("C2 Saldo total: " + (c2.getSaldo() + c2.getLimite()));
		
		c1.transferir(2000, c2);
		System.out.println();
		System.out.println("C1 Saldo: " + c1.getSaldo());
		System.out.println("C1 Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		System.out.println("C2 Saldo: " + c2.getSaldo());
		System.out.println("C2 Saldo total: " + (c2.getSaldo() + c2.getLimite()));
		
//		c1.numero = 1234;
//		c1.titular = "Bill";
//		c1.saldo = 200;
//		c1.limite = 500;
//		
//		System.out.println("Saldo atual: "+ c1.saldo);
//		System.out.println("Saldo total: " + (c1.saldo + c1.limite));
//				
//		c1.saldo = c1.saldo - 300;
//		
//		System.out.println();
//		System.out.println("Saldo atual: "+ c1.saldo);
//		System.out.println("Saldo total: " + (c1.saldo + c1.limite));
//		
//		c1.saldo = c1.saldo - 1200;
//		
//		System.out.println();
//		System.out.println("Saldo atual: "+ c1.saldo);
//		System.out.println("Saldo total: " + (c1.saldo + c1.limite));
	}
}
