
public class Engenheiro extends Funcionario implements Imprimivel {

	@Override
	public void imprimir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
	}

}
