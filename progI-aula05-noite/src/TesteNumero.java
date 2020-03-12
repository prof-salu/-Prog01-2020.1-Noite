
public class TesteNumero {

	public static void main(String[] args) {
		int x = 10;
		int y = x;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		if(x == y) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
		
		y = 5;
		
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		x = 7;

		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		
		if(x == y) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
	}

}
