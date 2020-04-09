
public class TestaVeiculosIguais {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("x", "xy", "preta", "z1000");
		Veiculo v2 = new Veiculo("x", "xy", "preta", "z1000");
		
		System.out.println(v1.equals(v2));
		
		Carro c1 = new Carro("x", "xy", "preta", "z1000", "ABC-1234");
		Aviao a1 = new Aviao("x", "xy", "preta", "z1000", "M5", "XT1234");
		
		System.out.println(c1.equals(a1));
		System.out.println(a1.equals(c1));	
	}

}
