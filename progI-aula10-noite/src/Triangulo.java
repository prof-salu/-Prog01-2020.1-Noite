
public class Triangulo extends Forma{
	@Override
	public void desenhar() {
		System.out.println("Desenhando triangulo");
	}
	
	//Apenas classes abstratas podem possuir m�todos abstratos
	//ERRO!
	//public abstract int getLados();
}
