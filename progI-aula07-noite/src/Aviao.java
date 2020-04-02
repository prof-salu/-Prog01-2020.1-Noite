//Sub classes (filhas)
public class Aviao extends Veiculo{
	String fabricante;
	String prefixo;	
	
	public Aviao() {
		super();
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
}
