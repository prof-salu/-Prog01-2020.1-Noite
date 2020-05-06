
public class TesteAnimal {

	public static void main(String[] args) {
		Formiga formiga = new Formiga();
		Cachorro cachorro = new Cachorro("Rex");
		Peixe peixe = new Peixe();
		
		formiga.caminha();
		formiga.come();
		
		cachorro.brinca();
		cachorro.come();
		
		peixe.brinca();
		peixe.come();

	}

}
