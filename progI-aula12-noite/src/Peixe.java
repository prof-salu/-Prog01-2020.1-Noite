
public class Peixe extends Animal
implements AnimalDeEstimacao{

	private String nome;
	
	public Peixe() {
		
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	@Override
	public void brinca() {
		System.out.println("Peixe brincando...");
	}
	
	@Override
	public void come() {
		System.out.println("Peixe comendo...");
	}
}
