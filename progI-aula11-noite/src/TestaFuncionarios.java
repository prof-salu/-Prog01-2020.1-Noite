import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestaFuncionarios {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		
		Motorista m1 = new Motorista();
		Vendedor v1 = new Vendedor();
		m1.setAdmissao(LocalDate.of(2001, 11, 23));
		m1.setNome("Antonio");
		m1.setTotalHoras(70);
		m1.setValorHora(18);
		m1.setDemissao(LocalDate.now());
		System.out.println("Salario Antonio: " + m1.calcularSalario());
		
		v1.setNome("Cristina");
		v1.setSalario(1200);
		v1.setTotalVendas(10000);
		v1.setComissao(0.05);//5%
		System.out.println("Salario Cristina: " + v1.calcularSalario());
	}

}
