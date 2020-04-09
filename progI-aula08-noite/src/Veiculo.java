//Super classe (Pai/Mãe)

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected String cor;	
	protected String motor;
	
	public Veiculo() {
		super();
	}	
	
	public Veiculo(String marca, String modelo, String cor, String motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
	}

	//Metodos final não podem ser reescritos
	public final void ligar() {
		System.out.println(getClass().getName() + " - Ligando o motor! (" + motor + ") ligado");
	}
	
	public void locomover(String clima) {
		System.out.println("Esta andando...");
	}
	
	public void imprimir() {
		System.out.println("Marca --> " + marca);
		System.out.println("Modelo --> " + modelo);
		System.out.println("Cor --> " + cor);
		System.out.println("Motor -->" + motor);
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", motor=" + motor + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Veiculo[Marca: " + marca + ", Modelo: " + modelo + ", Cor: " + cor + 
//				", Motor: " + motor + "]";
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Veiculo)) {
			return false;
		}
		
		Veiculo outroVeiculo = (Veiculo) obj;
		
		if(outroVeiculo.cor == this.cor && outroVeiculo.modelo == this.modelo &&
				outroVeiculo.marca == this.marca && outroVeiculo.motor == this.motor) {
			return true;
		}
		return false;
	}	
}
