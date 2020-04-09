//Sub classes (filhas)
public final class Aviao extends Veiculo{
	private String fabricante;
	private String prefixo;	
	
	public Aviao() {
		super();
	}
	
	public Aviao(String marca, String modelo, String cor, String motor, 
					String fabricante,
					String prefixo) {
		super(marca, modelo, cor, motor);
		this.fabricante = fabricante;
		this.prefixo = prefixo;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public void ativarTremDePouso() {
		System.out.println("Ativando o trem de pouso...");
	}
	
	//@Override --> Anotação que indica que um método está sendo reescrito
	
	@Override
	public void locomover(String clima) {
		System.out.println("Esta voando nos céus...");
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Fabricante --> " + fabricante);
		System.out.println("Prefixo --> " + prefixo);
	}

	@Override
	public String toString() {
		return "Aviao [fabricante=" + fabricante + ", prefixo=" + prefixo + ", marca=" + marca + ", modelo=" + modelo
				+ ", cor=" + cor + ", motor=" + motor + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Aviao)) {
			return false;
		}
		
		Aviao outroVeiculo = (Aviao) obj;
		
		if(outroVeiculo.cor == this.cor && outroVeiculo.modelo == this.modelo &&
				outroVeiculo.marca == this.marca && outroVeiculo.motor == this.motor) {
			return true;
		}
		return false;
	}
}
