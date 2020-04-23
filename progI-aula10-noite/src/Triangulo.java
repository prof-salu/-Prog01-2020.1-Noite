
public class Triangulo extends Forma{
	@Override
	public void desenhar() {
		System.out.println("Desenhando triangulo");
	}
	
	//Apenas classes abstratas podem possuir métodos abstratos
	//ERRO!
	//public abstract int getLados();
}
