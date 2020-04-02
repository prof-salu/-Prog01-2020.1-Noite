//Super classe (Pai/Mãe)

public class Veiculo {
	protected String marca;
	String modelo;
	String cor;	
	String motor;
	
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

	public void ligar() {
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
	
}
