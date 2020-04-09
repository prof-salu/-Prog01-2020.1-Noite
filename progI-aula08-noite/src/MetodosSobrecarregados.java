
public class MetodosSobrecarregados {
	
	public int soma(int x, int y) {
		return x + y;
	}
	
	public int soma(float x, float y) {
		return (int) (x + y);
	}
	
	//Erro - Não é sobrecarga métodos com retornos diferentes
//	public long soma(float x, float y) {
//		return (long) (x + y);
//	}
	
	public double multiplicar(int x, float y) {
		return x * y;
	}
	
	public double multiplicar(float y, int x) {
		return x * y;
	}
	
	public double multiplicar(float y, int x, long z) {
		return x * y * z;
	}
	
}
