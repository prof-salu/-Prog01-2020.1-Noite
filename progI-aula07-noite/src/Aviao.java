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
	
	//@Override --> Anota��o que indica que um m�todo est� sendo reescrito
	
	@Override
	public void locomover(String clima) {
		System.out.println("Esta voando nos c�us...");
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Fabricante --> " + fabricante);
		System.out.println("Prefixo --> " + prefixo);
	}
}
