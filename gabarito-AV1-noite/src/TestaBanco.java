
public class TestaBanco {

	public static void main(String[] args) {
		Titular t1 = new Titular("Afonso", "afonso@email.com", "Rua C, 78");

		ContaPoupanca cp = new ContaPoupanca(1234, 789, t1);
		ContaCorrente cc = new ContaCorrente(4567, 789, t1);
		ContaEspecial ce = new ContaEspecial(7788, 789, t1);

		ContaPoupanca doe = new ContaPoupanca(9999, 789, t1);

		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo especial: " + ce.getSaldo());
		System.out.println("Saldo especial + limite: " + ce.getSaldoComLimite());
		System.out.println("Saldo doação: " + doe.getSaldo());
		System.out.println();

		cp.depositar(1000);
		cc.depositar(1000);
		ce.depositar(1000);

		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo especial: " + ce.getSaldo());
		System.out.println("Saldo especial + limite: " + ce.getSaldoComLimite());
		System.out.println("Saldo doação: " + doe.getSaldo());
		System.out.println();

		cp.sacar(500);
		cc.sacar(500);
		ce.sacar(500);

		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo especial: " + ce.getSaldo());
		System.out.println("Saldo especial + limite: " + ce.getSaldoComLimite());
		System.out.println("Saldo doação: " + doe.getSaldo());
		System.out.println();

		cp.transferir(200, doe);
		cc.transferir(200, doe);
		ce.transferir(200, doe);

		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo especial: " + ce.getSaldo());
		System.out.println("Saldo especial + limite: " + ce.getSaldoComLimite());
		System.out.println("Saldo doação: " + doe.getSaldo());
		System.out.println();
	}
}
