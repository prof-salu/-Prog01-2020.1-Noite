//Sub classes (filhas)
public class Carro extends Veiculo{
	String placa;
	
	public Carro() {
		super();
	}
	
	public Carro(String motor, String modelo, String marca, String cor, String placa) {
		super(marca, modelo, cor, motor);
		this.placa = placa;
	}
	
	public void passarMarcha() {
		System.out.println("Trocando a marcha...");
	}
	
	@Override
	public void locomover(String clima) {
		System.out.println("Estou atrevessando as estradas...");
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Placa --> " + placa);
	}
	
}
