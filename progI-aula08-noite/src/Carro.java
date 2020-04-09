//Sub classes (filhas)
public final class Carro extends Veiculo{
	private String placa;
	
	public Carro() {
		super();
	}
	
	public Carro(String marca, String modelo, String cor, String motor, String placa) {
		super(marca, modelo, cor, motor);
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
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

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", motor=" + motor
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Carro)) {
			return false;
		}
		
		Carro outroVeiculo = (Carro) obj;
		
		if(outroVeiculo.cor == this.cor && outroVeiculo.modelo == this.modelo &&
				outroVeiculo.marca == this.marca && outroVeiculo.motor == this.motor) {
			return true;
		}
		return false;
	}

	
	// Métodos final não podem ser reescritos
//	public void ligar() {
//		
//	}
	
	
}
