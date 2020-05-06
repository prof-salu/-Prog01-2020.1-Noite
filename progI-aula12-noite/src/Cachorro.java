
public class Cachorro extends Animal
implements AnimalDeEstimacao{
	
	private String nome;
	
	public Cachorro() {
		
	}
	
	public Cachorro(String nome) {
		this.nome = nome;
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
		System.out.println("Cachorro brincando...");		
	}
	
	@Override
	public void come() {
		System.out.println("Cachorro comendo...");
	}

}
